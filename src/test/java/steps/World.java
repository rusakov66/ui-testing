package steps;

//import org.springframework.stereotype.Component;
import java.util.HashMap;

//@Component
public class World {

    private final HashMap<Class, Object> scenarioResources = new HashMap<>();

    public <T> T getResource(Class<T> clazz) throws Exception {
        if (!scenarioResources.containsKey(clazz)) {
            throw new Exception();
        }
        return (T) scenarioResources.get(clazz);
    }

    public <T> void putResource(Class<T> clazz, Object obj) {
        if (scenarioResources.containsKey(clazz)) {
            scenarioResources.replace(clazz, obj);
        } else {
            scenarioResources.put(clazz, obj);
        }
    }
}
