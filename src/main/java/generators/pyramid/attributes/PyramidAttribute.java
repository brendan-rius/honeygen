package generators.pyramid.attributes;

import lib.attributes.Attribute;
import lib.attributes.DateAttribute;
import lib.attributes.NumberAttribute;
import lib.attributes.TextAttribute;

public abstract class PyramidAttribute extends Attribute {
    protected PyramidAttribute(Attribute attribute) {
        super(attribute.getName());
    }

    public static PyramidAttribute newAttribute(Attribute attribute) throws AttributeTypeNotRecognizedException {
        if (attribute instanceof DateAttribute) {
            return new PyramidDateAttribute((DateAttribute) attribute);
        } else if (attribute instanceof NumberAttribute) {
            return new PyramidNumberAttribute((NumberAttribute) attribute);
        } else if (attribute instanceof TextAttribute) {
            return new PyramidTextAttribute((TextAttribute) attribute);
        } else {
            throw new AttributeTypeNotRecognizedException(attribute);
        }
    }

    /**
     * @return the SQLAlchemy type of the attribute as a string
     */
    public abstract String getType();
}