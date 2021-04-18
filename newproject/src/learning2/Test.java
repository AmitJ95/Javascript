package learning2;

public class Test {

	static int j = 20;
	int i = 10;
	public void m1() 
	{
		int k  = 30;
		final int m = 40;
		
		class Inner
		{
			public void m2() 
			{
				System.out.println(""+i+""+j+""+k+""+m);
			}
		}
		Inner i = new Inner();
		i.m2();

		
	}
		public static void main(String[] args) {
		Test t = new Test();
		t.m1();

	}

}
