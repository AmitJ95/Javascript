package learning;

public class B {

	public synchronized void d2(A1 a) 
	{
		System.out.println("Thread2 starts execution of d2 method");
		try 
		{
			Thread.sleep(6000);
		}
		catch(InterruptedException e) {}
		System.out.println("Thread2 trying to call A1's last()");
		a.last();
	}
	public synchronized void last() {
		System.out.println("Inside B, this is last() method");
	}
}
