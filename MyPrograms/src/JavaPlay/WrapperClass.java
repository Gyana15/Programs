package JavaPlay;

public class WrapperClass extends Object{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Integer i =5134;
System.out.println(i.doubleValue());
System.out.println(i.byteValue());
System.out.println((double)i);
System.out.println((int)i);
//System.out.println((byte)i); // Compilation error.
int j =51;
System.out.println((byte)j);
System.out.println((double)j);
System.out.println((Integer)j);
System.out.println(Integer.reverse(i));
System.out.println(Integer.rotateRight(i, i.SIZE));
//System.out.println((Double)j); // Can not cast to any other object
int k = 5;
String t = "34";
boolean b = false;
System.out.println(Integer.valueOf(t) + k);
System.out.println(Integer.parseInt(t) + String.valueOf(k));
System.out.println(String.valueOf(i)+(i+2));
System.out.println((Integer.valueOf(t)));

Integer I = 10;
String s= I.toString();
Object o =new Object();
o.getClass();
	}

}
