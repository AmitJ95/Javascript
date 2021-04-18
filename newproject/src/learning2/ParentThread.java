package learning2;

public class ParentThread extends Thread {
	
	public static InheritableThreadLocal tl = new InheritableThreadLocal()
			{
		      public Object childValue(Object p) 
		      {
		    	  return "cc";
		      }
			};		
    public void run() 
    {
    	tl.set("pp");
    	System.out.println("Parent thread value--"+tl.get());
    	ChildThread ct = new ChildThread();
    	ct.start();
    }
}
