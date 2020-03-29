package MultiThreading;

public class ExtendsThread extends Thread{
public final void run(){
	System.out.println("extends thread running............");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtendsThread et = new ExtendsThread();
		et.start();
	}

}
