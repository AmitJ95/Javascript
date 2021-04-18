package learning;

public class MyThread5 extends Thread {

	Display d;
	String name;
	
	MyThread5(Display d, String name )
	{
		this.d = d;
		this.name  = name;
		
	}
	public void run() 
	{
		d.wish(name);
	}
	
}
