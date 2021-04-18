package learning;

public class ThreadDemo1 {

	public static void main(String[] args)throws InterruptedException {
		MyThread1.mt = Thread.currentThread();
		MyThread1 t = new MyThread1();
		t.start();
		for(int i = 0; i<10; i++ ) 
		{
			System.out.println("Main Thread");
			Thread.sleep(2000);
		}
		

	}

}
