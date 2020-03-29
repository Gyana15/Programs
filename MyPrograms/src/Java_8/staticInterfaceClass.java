package Java_8;

interface staticInterface{
 static void check(){
	 System.out.println("In super static method");
 }
}
public class staticInterfaceClass implements staticInterface{
private void check(){
	System.out.println("In child same method");
}
public static void main(String args[]){
	staticInterfaceClass staticInterface1=new staticInterfaceClass();
	staticInterface.check();
	staticInterface1.check();
	
}
}
