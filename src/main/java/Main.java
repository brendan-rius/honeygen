import generators.APIGenerator;
import generators.File;
import generators.pyramid.PyramidAPIGenerator;
import lib.APIDescription;
import lib.Model;
import lib.attributes.NumberAttribute;
import lib.attributes.TextAttribute;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        APIDescription api = new APIDescription();
        Model model = new Model("product");
        model.addAttribute(new NumberAttribute("price"));
        api.addModel(model);
        Model model2 = new Model("user");
        model2.addAttribute(new NumberAttribute("age"));
        model2.addAttribute(new TextAttribute("name"));
        api.addModel(model2);
        APIGenerator generator = new PyramidAPIGenerator();
        Set<File> files = generator.generateAPI(api);
    }
}
