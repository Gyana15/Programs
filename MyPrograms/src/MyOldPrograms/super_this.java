package MyOldPrograms;

class parent {
parent(){
	System.out.println("Parent Class");
}
}
class child extends parent {
child(){
	super();
	System.out.println("Child Class");
}
/*child ab(){
	return this;
}*/
parent n(){
	parent a=new child();
	return a;
	
}
}
public class super_this {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
child a=new child();
//parent b=a.n();
a.n();
	}

}
