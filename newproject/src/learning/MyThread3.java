package learning;

public class MyThread3 extends Thread {
	Display d;
	String name;
	MyThread3(Display d,String name)
	{
		this.d = d;
		this.name = name;
	}
       public void run() 
       {
    	   d.wish(name);
       }
}
