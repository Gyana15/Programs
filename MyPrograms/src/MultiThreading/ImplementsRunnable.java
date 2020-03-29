package MultiThreading;

/*class A implements Runnable{
	public void run(){
		System.out.println("Runnable running.............");
	}
}*/
public class ImplementsRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//A a = new A();
/*Thread t = new Thread(new Runnable(){
	public void run() {
		System.out.println("Runnable running here............");
		
	}
});*/
Thread t = new Thread(()->{System.out.println("Runnable running here............");});
t.start();
System.out.println("Main Running...............");
	}

}
