package lib.attributes;

import java.util.Set;

public class TextAttribute extends Attribute {
    String value;
    Set<TextAttributeConstraint> constraints;

    public TextAttribute(String name) {
        super(name);
    }
}
