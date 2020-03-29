package MultiThreading;

class Q{
	int count;
	boolean valueSet = false;

	public synchronized int get() {
		System.out.println("value of value set in get : "+valueSet);
		while(!valueSet){
			try{
				System.out.println("Executing in get......"+valueSet);
				wait();} catch(Exception e) {}
		}
		System.out.println("get : " + count);
		valueSet=false;
		notify();
		return count;
	}

	public synchronized void put(int count) {
		System.out.println("value of value set in put : "+valueSet);
		while(valueSet){
			try{
				System.out.println("Executing in put.........."+valueSet);
				wait();} catch(Exception e) {}
		}
		System.out.println("put : " + count);
		this.count = count;
		valueSet=true;
		notify();
	}
	
}
class producer implements Runnable{
	Q q;
	public producer(Q q){
		this.q=q;
		new Thread(this,"producer").start();
		try {
			new Thread(this,"producer").join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void run() {
		int i=0;
		while(true){
			q.put(i++);
			try{ Thread.sleep(1000); } catch(Exception e) {}
		}
		
	}
}

class consumer implements Runnable{
	Q q;
	public consumer(Q q){
		this.q=q;
		new Thread(this,"consumer").start();
		try {
			new Thread(this,"consumer").join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			q.get();
			try{ Thread.sleep(1000); } catch(Exception e) {}
		}
	}
}

public class InterThreadCommunication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q q = new Q();
		new producer(q);
		new consumer(q);
	}

}
