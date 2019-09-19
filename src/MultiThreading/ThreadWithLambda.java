package MultiThreading;

/************THREAD USING ANNANYMOUS CLASS AND LAMBDA EXPRESSION*******************/
public class ThreadWithLambda {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		/*System.out.println("1.Thread using ananymous class==>");
	
		Runnable obj1=new Runnable() {
			public void run() {
				for(int i=1;i<=5;i++) {
					System.out.println("Hi");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		
		Runnable obj2=new Runnable() {
			public void run() {
				for(int i=1;i<=5;i++) {
					System.out.println("Hello");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		
		Thread t1= new Thread(obj1);
		Thread t2= new Thread(obj2);
		
		t1.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();*/
		
		System.out.println("2.Thread using lambda expression==>");
		
		Runnable obj1=() ->{
				for(int i=1;i<=5;i++) {
					System.out.println("Hi");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		;
		
		Runnable obj2=()-> {
				for(int i=1;i<=5;i++) {
					System.out.println("Hello");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		;
		
		Thread t1= new Thread(obj1); //as obj1 used only once we can pass obj code directly here instead of obj1
		Thread t2= new Thread(obj2);
		
		t1.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();

		System.out.println("Before join()=>"+t1.isAlive());		// to check thread is active or not
		
		t1.join(); 			//to stop main thread for printing bye before t1 & t2 execution is done
		t2.join();
		
		System.out.println("After join()=>"+t1.isAlive()); // to check thread is active or not
		
		System.out.println("---Bye---");		//it will print at the end of t1,t2 execution
	}

}
