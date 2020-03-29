
public class stringPlay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(String.valueOf(2));
String s1= "Gyana1";
String s2="an";
System.out.println(s1.contains(s2));
System.out.println(s1.chars());
System.out.println(s1.compareTo(s2));
System.out.println(s1.indexOf(s2));
System.out.println(s1.isEmpty());
System.out.println(s1.valueOf(s2));
System.out.println(s1.concat("abcd"));
System.out.println(s1.contentEquals(s2));
System.out.println(s1.lastIndexOf(1));
System.out.println(s1.length() +" "+s1.matches("[0-9]"));
System.out.println(s1.replace('a', 'n'));
System.out.println(s1.replaceAll("[A-G]", "T"));
System.out.println(s1.replaceFirst("[A-G][a-s]", "xyz"));
System.out.println(s1.substring(1,5));
System.out.println(s1.substring(2));
System.out.println(s1.substring(s1.lastIndexOf('a')+1));
System.out.println(s1.valueOf('c'));
System.out.println();
	}

}
