package learning;

public class MyThread4 extends Thread {

	MyThread4(ThreadGroup g,String name)
	{
		super(g,name);
	}
	
	public void run() 
	{
		System.out.println("Child Thread");
		try 
		{
			Thread.sleep(5000);
		}
		catch(InterruptedException e) {}
			
		
	}
}

