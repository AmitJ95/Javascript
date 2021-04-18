package java_programs;
//Autoboxing vs widening
public class AB1 {

//	public static void m1(Integer I) {
//		System.out.println("Autoboxing");
//		
//	}
//	public static void m1(long l) {
//		System.out.println("Widening");
//		
//	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		int x=10;
//		m1(x);
//	}
//	public static void m1(Long l) {
//		System.out.println("Long");
//	}
	 void bubbleSort(int arr[])
	    {
	        int n = arr.length;
	        for (int i = 0; i < n-1; i++)
	            for (int j = 0; j < n-i-1; j++)
	                if (arr[j] > arr[j+1])
	                {
	                    // swap temp and arr[i]
	                    int temp = arr[j];
	                    arr[j] = arr[j+1];
	                    arr[j+1] = temp;
	                }
	    }
	public static void main (String[] args) {
		//int x=10;
		//m1(x);
		AB1 o = new AB1();
		int arr[] = {64, 34, 25, 12, 22, 11, 90};
		o.bubbleSort(arr);
		System.out.println("Sorted array");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]+ " ");
		}
		
	}
       
}
