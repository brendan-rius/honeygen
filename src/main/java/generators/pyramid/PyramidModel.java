package generators.pyramid;

import generators.pyramid.attributes.AttributeTypeNotRecognizedException;
import generators.pyramid.attributes.PyramidAttribute;
import lib.Model;

import java.util.Set;
import java.util.stream.Collectors;

/**
 * Represents a model with some specific information that Python and Pyramid need to generate the code
 */
public class PyramidModel {
    /**
     * The Python class name of the model
     */
    private final String className;

    /**
     * The SQL table name of the model
     */
    private final String tableName;

    /**
     * The attributes that compose the model
     */
    private final Set<PyramidAttribute> attributes;

    public PyramidModel(Model model) {
        // The class name if the camelCase name of the model
        this.className = model.getName();

        // The table name if the pluralized lowercase name of the model
        this.tableName = model.pluralName().toLowerCase();

        // We map each attribute of the model to a pyramid attribute that will allow us to manipulate it easily
        this.attributes = model.getAttributes().stream().map(attribute -> {
            try {
                return PyramidAttribute.newAttribute(attribute);
            } catch (AttributeTypeNotRecognizedException e) {
                return null;
            }
        }).collect(Collectors.toSet());
    }

    public String getClassName() {
        return className;
    }

    public String getTableName() {
        return tableName;
    }

    public Set<PyramidAttribute> getAttributes() {
        return attributes;
    }
}
