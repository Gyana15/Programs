package MyOldPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l1=new ArrayList();
		l1.add(0, "Gyan");
		l1.add(1, "Ranjan");
		l1.add(2, "Mahapatra");
		System.out.println(l1);
		l1.add(2,"xyz");
		System.out.println(l1 + " " +l1.get(2));
int a[]=new int[8];
for(int i=0;i<8;i++){
	a[i]=i;
}
//for(int j:a)
//	System.out.println(j);
List l2=new ArrayList();
l2.add("Sonit");
l2.add("Dora");
l2.add("Sourav");
/*System.out.println(l2);
l2.remove(1);*/
System.out.println(l2);
Set s=new HashSet();
s.add("seta");
s.add("setc");
s.add("setb");
System.out.println(s);
Collections.sort((List) s);
System.out.println(s);

Set s1=new TreeSet(s);
System.out.println(s1.size());
System.out.println("Gyan");
	}
}
