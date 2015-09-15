package generators.pyramid.attributes;

import lib.attributes.NumberAttribute;

public class PyramidNumberAttribute extends PyramidAttribute {
    public PyramidNumberAttribute(NumberAttribute attribute) {
        super(attribute);
    }

    @Override
    public String getType() {
        return "Integer"; // TODO: handle floating point numbers
    }
}
