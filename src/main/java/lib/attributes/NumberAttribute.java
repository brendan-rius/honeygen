package lib.attributes;

import java.util.Set;

public class NumberAttribute extends Attribute {
    Double value;
    Set<NumberAttributeConstraint> constraints;

    public NumberAttribute(String name) {
        super(name);
    }
}
