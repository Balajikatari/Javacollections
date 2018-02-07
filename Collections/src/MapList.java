import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class MapList {
	public static void main(String[] args) {
		int count =0;
		Map<String, Integer> map = new HashMap<>();
		map.put("key1", 10);
		map.put("key2", 20);
		map.put("key3", 30);
		map.put("key4", 30);
		
		for (Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
			if (entry.getValue()==30){
				count++;
			}
		}
		System.out.println(count);
	}
}
