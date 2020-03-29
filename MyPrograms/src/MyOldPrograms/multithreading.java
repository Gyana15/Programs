package MyOldPrograms;
class thread implements Runnable{
	public void run(){
		for(int i=1;i<5;i++){
		try{
			Thread.sleep(3000);
		}
		catch(InterruptedException e){
			System.out.println("lets wait");
		}
		System.out.println(Thread.currentThread());
	}
	}
}

public class multithreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thread a=new thread();
		thread b=new thread();
		Thread t=new Thread(a,"t");
		Thread t2=new Thread(b,"t2");
		//t.setPriority(6);
		//t2.setPriority(3);
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		//t.interrupt();
		//t2.interrupt();
		//System.out.println(Thread.currentThread());
		System.out.println("Alive");
	}

}
