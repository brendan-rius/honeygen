package generators.pyramid.attributes;

import lib.attributes.TextAttribute;

public class PyramidTextAttribute extends PyramidAttribute {
    public PyramidTextAttribute(TextAttribute attribute) {
        super(attribute);
    }

    @Override
    public String getType() {
        return "Text";
    }
}
