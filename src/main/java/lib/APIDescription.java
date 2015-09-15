package lib;

import java.util.HashSet;
import java.util.Set;

public class APIDescription {
    String name;
    Set<Model> models = new HashSet<>();

    public Set<Model> getModels() {
        return models;
    }

    public void addModel(Model model) {
        this.models.add(model);
    }
}
