package generators;


import lib.APIDescription;

import java.util.Set;

public abstract class APIGenerator {
    public abstract Set<File> generateAPI(APIDescription apiDescription);
}
