package learning;

public class SynchronizedDemo {

	public static void main(String[] args) {
		Display d = new Display();
		MyThread3 t1 = new MyThread3(d,"Dhoni");
		MyThread3 t2 = new MyThread3(d,"Yuvraj");
		t1.start();
		t2.start();

	}

}
