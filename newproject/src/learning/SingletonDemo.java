package learning;

public class SingletonDemo {

	private static SingletonDemo t = new SingletonDemo();
	
	private SingletonDemo() 
	{
		
	}
	public static SingletonDemo getSingletonDemo() 
	{
		return t;
	}
	
	SingletonDemo t1 = SingletonDemo.getSingletonDemo();
	SingletonDemo t2 = SingletonDemo.getSingletonDemo();
	SingletonDemo t3 = SingletonDemo.getSingletonDemo();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
