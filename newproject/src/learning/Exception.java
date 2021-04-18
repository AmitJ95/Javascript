package learning;

public class Exception {

	public static void main(String[] args)throws InterruptedException {
		doStuff();
		// TODO Auto-generated method stub

	}
	public static void doStuff()throws InterruptedException {
		doMoreStuff();
	}

	public static void doMoreStuff()throws InterruptedException {
		Thread.sleep(10000);
	}
}
