package learning2;

public class CustomerThread extends Thread{

	static Integer custId = 0;
	
	private static  ThreadLocal tl = new ThreadLocal()
	{
		protected Integer initialValue() 
		{
			return ++custId;
		}
	};
	
	CustomerThread(String name) {
		
		super(name);
	}

	public void run() 
	{
		System.out.println(Thread.currentThread().getName()+"exexcuting with customer id: " +tl.get());
	}
}
