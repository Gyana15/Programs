import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class duplicateRemoval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="gyanaranjan";
		String temp = "";
Set<Character> set=new LinkedHashSet<Character>();
for(int i=0;i<s.length();i++){
	set.add(s.charAt(i));
}
Iterator i=set.iterator();
while(i.hasNext())
temp=temp+i.next();
System.out.println(temp);

//-----------------------------------------------------------
StringBuffer s1=new StringBuffer();
s.chars().distinct().forEach(c -> s1.append((char) c));

System.out.println(s1);



StringBuilder sb = new StringBuilder();
int idx;
for (int j = 0; j < s.length(); j++) {
    char c = s.charAt(j);
    idx = s.indexOf(c, j + 1);
    if (idx == -1) {
        sb.append(c);
    }
}
System.out.println(sb);
int index=1;
char[] chars=s.toCharArray();
Arrays.sort(chars);
	
	 String result = "";
	    for (int h = 0; h < s.length(); h++) {
	        if(!result.contains(String.valueOf(s.charAt(h)))) {
	            result += String.valueOf(s.charAt(h));
	        }
	    }
System.out.println(result);
String s2="21";
System.out.println(Integer.toString((Integer.parseInt(s2))+1)+1);
	}

}
