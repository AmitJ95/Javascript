package java_programs;

import java.util.*;

public class StringRemove2 {

	public static void main(String[] args) {
        String result = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");

		String s = sc.next();
		System.out.println("Input string is " + s);
        char[] ch = s.toCharArray();
		
		for(int i = 0; i<ch.length; i++) {
			
			if(!Character.isDigit(ch[i])) {
				result = result + ch[i];
			}
			
		}

		System.out.println("Modified string is: "+result);
		sc.close();
	}

}
