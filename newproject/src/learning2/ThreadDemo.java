package learning2;

public class ThreadDemo {

	public static void main(String[] args) {
		
		ThreadLocal tl = new ThreadLocal();
		System.out.println(tl.get());
		tl.set("Amit");
		System.out.println(tl.get());
		tl.remove();
		System.out.println(tl.get());
		
	}

}
