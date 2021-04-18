package learning;
import java.lang.*;


public class ThreadGroupDemo {

	public static void main(String[] args) throws InterruptedException {
		
		ThreadGroup pg = new ThreadGroup("parent group");
		ThreadGroup cg = new ThreadGroup("child group");
		
		MyThread4 t1 = new MyThread4(pg,"Child Thread1");
		MyThread4 t2 = new MyThread4(pg,"Child Thread2");
		t1.start();
		t2.start();
		System.out.println(pg.activeCount());
		System.out.println(pg.activeGroupCount());
		pg.list();
		Thread.sleep(10000);
		System.out.println(pg.activeCount());
		System.out.println(pg.activeGroupCount());
		pg.list();
	} 

}
