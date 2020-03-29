package MyOldPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;


public class set_map {


public void hashset(){
Set s=new HashSet();
s.add(7);
s.add(1);
s.add(5);
s.add(2);
s.add(3);
System.out.println("Executing set1: "+s);

Set s1=new HashSet();
s1.add("Ajay");
s1.add("Vijay");
s1.add("Mahapatra");
System.out.println(s1);

Set s2=new TreeSet();
s2.addAll(s1);
System.out.println(s2);
}

public void arraylist(){
List<Integer> list = new ArrayList<>();
list.add(6);
list.add(4);
list.add(4);
list.add(5);
Collections.sort(list);
Set<Integer> unique = new LinkedHashSet<>(list); // 4 5 6
System.out.println("Executing set2: "+ unique + " " + list);}

public void hashmap(){
Map<String,String> m=new HashMap<String,String>();
m.put("name", "Gyana");
m.put("place", "Nayagarh");
m.put("pincode", "752085");
m.put("bank", "yesbank");
System.out.println("Executing set3: "+m);

Map<String,String> m1=new TreeMap<String,String>(m);
System.out.println(m1);

    for (Entry<String, String> entry : m1.entrySet()) {
        System.out.println("Key : " + entry.getKey() 
			+ " Value : " + entry.getValue());
}
}


}
