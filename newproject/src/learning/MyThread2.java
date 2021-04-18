package learning;

public class MyThread2 extends Thread{
	public void run() 
	{
		try 
		{
			for(int i = 0; i<10; i++ ) 
			{
				System.out.println(Thread.currentThread().getName());
				System.out.println("lazy thread");
				Thread.sleep(2000); 	
			}
		}
		catch(InterruptedException e) 
		{
			System.out.println("I got interrupted");
		}
	}
}