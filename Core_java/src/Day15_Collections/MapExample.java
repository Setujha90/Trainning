package Day15_Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(23, "A");
		map.put(20, "B");
		map.put(78, "C");
		
		for(Map.Entry<Integer, String> ent : map.entrySet()) {
			System.out.println(ent.getKey() + " " + ent.getValue() );
		}

	}

}
