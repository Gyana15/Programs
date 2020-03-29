package MyOldPrograms;
class Z{
	int bal=1000;
}
class X1 implements Runnable{
	Z p;
	int r;
	int sleepvalue;
	X1(int a,int b,Z g){
		r=a;
		sleepvalue=b;
		p=g;
	}
	public void run(){
		if(p.bal>r)
			System.out.println("Fund available");
		try{
			Thread.sleep(sleepvalue);
		}catch(InterruptedException e){}
		if(p.bal>r){
			p.bal=p.bal-r;
			System.out.println("Got it !!!" + Thread.currentThread());
		}
		else
			System.out.println("Insufficient");
	}
}
public class threadSynchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Z n=new Z();
X1 job1=new X1(50,1000,n);
X1 job2=new X1(2000,0,n);
Thread t1=new Thread(job1,"job1");
Thread t2=new Thread(job2,"job2");
t1.start();
t2.start();
	}

}
