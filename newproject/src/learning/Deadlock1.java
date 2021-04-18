package learning;

public class Deadlock1 extends Thread {

	A1 a = new A1();
	B b = new B();
	
	public void m1() 
	{
		this.start();
		a.d1(b);//This line is executed by main thread
	}
	public void run() 
	{
		b.d2(a);//This line is executed by child thread
	} 
	public static void main(String[] args) {
		
		Deadlock1 d = new Deadlock1();
		d.m1();
       
	}

}
