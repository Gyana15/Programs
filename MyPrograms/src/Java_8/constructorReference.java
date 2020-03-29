package Java_8;
interface interef{
	public constructorReference m1(int x);
}

public class constructorReference {
	constructorReference(int x){
		
		System.out.println(x+"Executing constructor here");
	}
	public constructorReference m1(){
		System.out.println("Executing inside class");
		constructorReference c=new constructorReference(2);
		return c;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interef interef=constructorReference::new;
		interef.m1(2);
	}

}
