package generators.pyramid;


import generators.APIGenerator;
import generators.File;
import lib.APIDescription;
import lib.Model;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;

import java.io.StringWriter;
import java.util.Set;
import java.util.stream.Collectors;

public class PyramidAPIGenerator extends APIGenerator {
    private final VelocityEngine ve;
    private final Template modelTemplate;

    public PyramidAPIGenerator() {
        this.ve = new VelocityEngine();
        this.ve.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath");
        this.ve.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());
        this.ve.init();
        this.modelTemplate = this.ve.getTemplate("model.vm");
    }

    @Override
    public Set<File> generateAPI(APIDescription apiDescription) {
        Set<Model> models = apiDescription.getModels();

        return models.stream().map(model -> {
            String filename = "models/" + model.getName().toLowerCase() + ".py";

            // We create the context that will hold the template variables
            VelocityContext context = new VelocityContext();

            // We create a pyramid model from the model and add it to the template variables
            PyramidModel pyramidModel = new PyramidModel(model);
            context.put("model", pyramidModel);

            StringWriter writer = new StringWriter();
            this.modelTemplate.merge(context, writer);
            return new File(filename, writer.toString());
        }).collect(Collectors.toSet());
    }
}
