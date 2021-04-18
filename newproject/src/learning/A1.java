package learning;

public class A1 {

	public synchronized void d1(B b) 
	{
		System.out.println("Thread1 starts execution of d1 method");
		try 
		{
			Thread.sleep(6000);
		}
		catch(InterruptedException e) {}
		System.out.println("Thread1 trying to call B's last()");
		b.last();
	}
	public synchronized void last() {
		System.out.println("Inside A1, this is last() method");
	}
}
