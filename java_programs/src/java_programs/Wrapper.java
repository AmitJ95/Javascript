package java_programs;

public class Wrapper {

	public static void main(String[] args) {
           
//        Integer i = new Integer(10);
//        System.out.println(i);
		
		Integer I = Integer.valueOf("100",2);
		System.out.println(I);
				
        
        Float f = new Float("10.5f");
        System.out.println(f);
        
        Character ch = new Character('a');
        System.out.println(ch);
	}

}
