package DB;

import java.util.HashMap;
import java.util.Set;

public class MapTest {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(10, "Ten");
		map.put(20, "Twenty");
		map.put(30, "Thirty");
//		System.out.println(map.get(10));
		Set<Integer> ks = map.keySet();
		for(Integer i : ks)
			System.out.println(i + " " + map.get(i));
	}
}
