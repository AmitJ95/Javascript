package learning;

public class ThreadSleepDemo {

	public static void main(String[] args) {
		MyThread2 t = new MyThread2();

		t.start();
		t.interrupt();
		System.out.println("End of main thread");

	}

}
