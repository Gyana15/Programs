package Java_8;

public class defaultClass implements defaultInterface, defaultNewInterface{
	public void check(){
		defaultNewInterface.super.check();
		defaultInterface.super.check();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		defaultClass defaultInterface=new defaultClass();
			defaultInterface.check();
			
			child child = new child();
			child.check();
			child.ran();
			
			defaultInterface child1 = new child();
			child1.check();
			//child1.ran(); // Compilation error
			
	}

}
