package learning;
import java.io.*;
public class MultiCatchBlock {

	public static void main(String[] args) {
	     try 
	     {
	    	 System.out.println(10/0);
	     }
	     catch(RuntimeException e) 
	     {
	          e.printStackTrace();   	 
	     }
	}
	

}
