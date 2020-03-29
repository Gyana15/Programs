

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class removeFirstSecondDupilcate {

	private static String name = "gyana";
	
	public static void main(String[] args) {
		String temp = null;
		// TODO Auto-generated method stub
Set<Character> s=new LinkedHashSet<Character>();
for(int i=0;i<name.length();i++){
s.add(name.charAt(i));
}
Iterator i1=s.iterator();
while(i1.hasNext()){
	System.out.println(i1.next());}
	}

}
