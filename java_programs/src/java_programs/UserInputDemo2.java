package java_programs;

import java.util.*;

public class UserInputDemo2 {

	public static void main(String[] args) {
		int mul = 1;
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements you want in array: ");

		int n = sc.nextInt();
		int[] arr = new int[n];

		System.out.println("Enter the elements of array: ");

		for (int i : arr) {

			arr[i] = sc.nextInt();
			if (arr[i] > 0 && arr[i] < 100000) {
				continue;
			} else {
				break;
			}
		}
        
		for (int i : arr) {
			System.out.println("Elements in array are: " +i);
		}
//		for (int i : arr) {
//			mul = mul * arr[i];
//		}

		sc.close();
		System.out.println("Multiplication of elements of array is: " + mul);
	}

}
