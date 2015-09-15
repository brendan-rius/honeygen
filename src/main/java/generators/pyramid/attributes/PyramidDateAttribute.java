package generators.pyramid.attributes;

import lib.attributes.DateAttribute;

public class PyramidDateAttribute extends PyramidAttribute {
    public PyramidDateAttribute(DateAttribute attribute) {
        super(attribute);
    }

    @Override
    public String getType() {
        return "DateTime";
    }
}
