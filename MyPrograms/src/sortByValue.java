import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;

public class sortByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Object,Object> map=new LinkedHashMap();
		Map map1=new LinkedHashMap();
		map.put("z", 10);
        map.put("b", 5);
        map.put("a", 6);
        map.put("c", 20);
        map.put("d", 1);
        map.put("e", 7);
        map.put("y", 8);
        map.put("n", 99);
        map.put("j", 50);
        map.put("m", 2);
        map.put("f", 9);
		System.out.println(map);
		SortedMap<Object,Object> tm=new TreeMap();
		for(Map.Entry mp : map.entrySet()){
			tm.put(mp.getValue(),mp.getKey());
		}
		//System.out.println(tm);
		for(Map.Entry mp : tm.entrySet()){
			map1.put(mp.getValue(),mp.getKey());
		}
		System.out.println(map1);
	}

}
