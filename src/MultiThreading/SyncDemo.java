package MultiThreading;

class Counter{
	int count;
	public synchronized void increment() {
		// made method synchronized so that t1 AND t2 can access method simultaneously
		count++;
	}
}

public class SyncDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Counter c=new Counter();
		//c.increment();
		
		Thread t1=new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=1;i<=1000;i++)
					c.increment();
			}
		});
		
		Thread t2=new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i=1;i<=1000;i++)
					c.increment();
			}
		});
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
		System.out.println("Count  "+c.count);
	}

}
