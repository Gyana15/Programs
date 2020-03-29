package MyOldPrograms;
//Final classes can not be inherited
//Abstract methos has to be defined in ints child class
abstract class c{
	public static int a=2;
	public abstract void display();
}
class d extends c{
	public void display(){
		System.out.println("New life");
	}
}
public class abstract_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
c n=new d();
n.display();
	}

}
