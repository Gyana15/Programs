package Java_8;
interface X{
	public void m1(int x);
}
public class methodReference {
public static void m2(int x){
	System.out.println("m1 available here in m2..");
}
public void m3(int x){
	System.out.println("m1 available here in m3..");
}
public boolean m4(int x){
	System.out.println("m1 available here in m3..");
	return false;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		X x=methodReference::m2;
		x.m1(4);
		methodReference methodReference = new methodReference();
		X y = methodReference::m3;
		y.m1(5);
		X z=methodReference::m4;
	//System.out.print(z.m1(4)); // compile time error
	}

}
