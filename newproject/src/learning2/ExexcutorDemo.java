package learning2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExexcutorDemo {

	public static void main(String[] args) {
		PrintJob[] jobs = {
				            new PrintJob("durga"),
				            new PrintJob("Ravi"),
				            new PrintJob("Amit"),
				            new PrintJob("Akshay"),
				            new PrintJob("Shiva"),
				            new PrintJob("Rahul") };
				            
       	ExecutorService service = Executors.newFixedThreadPool(3);	
       	
       	for(PrintJob job:jobs) 
       	{
       		service.submit(job);
       	}
       	
       	service.shutdown();
				            
		
				            
		
		}
	}
		


