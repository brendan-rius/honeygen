package lib;


import lib.attributes.Attribute;
import lib.relationships.Relationship;

import java.util.HashSet;
import java.util.Set;

public class Model {
    /**
     * The camelCase name of the product
     */
    String name;
    /**
     * The attributes that compose the model
     */
    Set<Attribute> attributes = new HashSet<>();
    Set<Relationship> relationships = new HashSet<>();
    Set<Serializer> serializers = new HashSet<>();

    public Model(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
     * Pluralize the name
     *
     * @return the pluralized name
     */
    public String pluralName() {
        return name + "s"; // TODO: handle more complex pluralization logic
    }

    public Set<Attribute> getAttributes() {
        return attributes;
    }

    /**
     * Add an attribute to the model
     *
     * @param attribute the attribute to add
     */
    public void addAttribute(Attribute attribute) {
        this.attributes.add(attribute);
    }
}
