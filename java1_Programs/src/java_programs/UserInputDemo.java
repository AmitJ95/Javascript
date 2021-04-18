package java_programs;
import java.util.*;

public class UserInputDemo {

	public static void main(String[] args) {
		int mul=1;
		// TODO Auto-generated method stub
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the number of elements you want in array: ");
          
          int n = sc.nextInt();
          int[] arr = new int[n];
          
          System.out.println("Enter the elements of array: ");
          
          for(int i = 0; i< arr.length; i++) {
        	  arr[i] = sc.nextInt();
        	  if(arr[i]>0 && arr[i]< 100000) {
        		  continue;
        	  }
        	  else {break;}
          }
          
          
          for(int i = 0; i< arr.length; i++) {
        	  mul = mul*arr[i];
          }
         
          sc.close();
          System.out.println("Multiplication of elements of array is: " + mul);
	}

}
