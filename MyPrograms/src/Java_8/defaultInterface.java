package Java_8;

public interface defaultInterface {

	default void check(){
		System.out.println("In default Interface");
	}
}

interface defaultNewInterface {

	default void check(){
		System.out.println("In default new Interface");
	}
}

 class child implements defaultInterface{
	public void ran(){
		System.out.println("Running in child only............");
	}
}
