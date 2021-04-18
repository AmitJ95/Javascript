package learning;
import java.util.concurrent.locks.*;
public class LockDemo1 {

	ReentrantLock l = new ReentrantLock();
	
	public void wish(String name) 
	{
		l.lock();
		for(int i = 0; i<10; i++) 
		{
			System.out.println("Good morning");
			try 
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {}
		}
		System.out.println(name);
		l.unlock();
	}
	
}
