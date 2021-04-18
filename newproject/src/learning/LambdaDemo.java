package learning;

public class LambdaDemo {

	public static void main(String[] args) {
		A obj;
/*		obj = new A() 
		{
			public void show() 
			{
				System.out.println("Hello");
			}
		};*/
          obj = () -> System.out.println("Hello");
          obj.show();
	}

}
