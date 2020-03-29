package Java_8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeMap<Integer,String> tr=new TreeMap<Integer,String>((o1,o2)->o2.compareTo(o1));
tr.put(1, "Gyana");
tr.put(5, "Gyana");
tr.put(4, "Gyana");
tr.put(3, "Gyana");
tr.put(2, "Gyana");
tr.put(1, "Gyana");
System.out.println(tr);

List<Integer> l1=Arrays.asList(2,5,3,1,7,9);
//TreeSet ts=new TreeSet(l1,(i1,i2)->i2.compareTo(i1));
TreeSet ts1=new TreeSet(l1);
ts1.comparator();
System.out.println(ts1);
Collections.sort(l1,(i1,i2)->i2.compareTo(i1));
System.out.println(l1);
	}

}
