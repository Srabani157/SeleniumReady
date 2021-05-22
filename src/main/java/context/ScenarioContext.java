package context;

import java.util.HashMap;
import java.util.Map;

public class ScenarioContext {

	private Map<String, Object> scenarioContext;

	public ScenarioContext() {
		scenarioContext = new HashMap<>();
	}

	public void setContext(String key, Object value) {
		scenarioContext.put(key, value);
	}

	public String getContext(String key) {
		return (String) scenarioContext.get(key);
	}

	public boolean containsContext(String key) {
		return scenarioContext.containsKey(key);
	}

}
