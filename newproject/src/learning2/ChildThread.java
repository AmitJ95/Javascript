package learning2;

public class ChildThread extends Thread {

	public void run() {
		
		System.out.println("Child Thread value----"+ParentThread.tl.get());
	}
}
