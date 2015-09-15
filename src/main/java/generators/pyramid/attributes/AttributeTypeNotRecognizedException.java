package generators.pyramid.attributes;

import lib.attributes.Attribute;

public class AttributeTypeNotRecognizedException extends Exception {
    public AttributeTypeNotRecognizedException(Attribute attribute) {
        super("Attribute of type " + attribute.getClass().getName() + " not supported");
    }
}
