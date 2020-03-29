package MyOldPrograms;

class x {
	public static final int f=1;
x(int i){
	System.out.println("Inheritance 1");
	go();
}
protected void go(){
	System.out.println("Gyan");
}
}
class Y extends x{
	Y(int j){
	super(0);	
	}
	 protected void go(){
		System.out.println("Gyana");
		System.out.println(f);
	}
}

public class inheritance{
	public static void main(String args[]){
		Y a=new Y(3);
		a.go();
	}
}
//This must be the 1st statement//else compile time error
	
