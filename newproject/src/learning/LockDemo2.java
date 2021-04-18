package learning;

public class LockDemo2 {

	public static void main(String[] args) {
		Display d = new Display();
		MyThread5 t1 = new MyThread5(d,"Dhoni");
		MyThread5 t2 = new MyThread5(d,"Yuvraj");
		MyThread5 t3 = new MyThread5(d,"Yuvraj");		
		

	}

}
