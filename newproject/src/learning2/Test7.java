package learning2;

public class Test7 {

	int i;
	
	Test7(int i )
	{
		this.i = i;
	}
	
	public int hashCode() 
	{
		return i;
	}
	public static void main(String[] args) {
		
		Test7 t1 = new Test7(10);
		Test7 t2 = new Test7(100);
		System.out.println(t1);
		System.out.println(t2);

	}

}
