package lab2;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Congregation {
	public List<String> getList(String item) {
		List<String> l = new ArrayList<String>();
		l.add(item);
		return l;
	}
	public Map<String, String> getMap(String key, String value) {
		Map<String, String> m = new HashMap<String, String>();
		m.put(key, value);
		return m;
	}
}

