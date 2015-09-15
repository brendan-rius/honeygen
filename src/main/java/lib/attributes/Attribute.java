package lib.attributes;

public abstract class Attribute {
    protected String name;

    public Attribute(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
