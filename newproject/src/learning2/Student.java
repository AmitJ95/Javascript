package learning2;

public class Student {

	String name;
	int rollno;
	
	Student(String name, int rollno)
	{
		this.name = name;
		this.rollno = rollno;
	}
	public boolean equals(Object obj) 
	{
	 
//		if(obj==this) 
//		{
//			return true;
//		}
	  if(obj instanceof Student) 
	  {
		  Student s = (Student)obj;
	 
	 	  if(name.equals(s.name) && rollno==s.rollno) 
		  {
			  return true;
		  }
		  else 
		  {
			  return false;
		  }
	  }
	  	return false;
	  }
	  
	  	
	
	public static void main(String[] args) {
		
		Student s1 = new Student("durga", 101);
		Student s2 = new Student("Ravi", 102);
		Student s3 = new Student("durga", 101);
		Student s4 = s1;
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
//		System.out.println(s1.equals("durga"));
//		System.out.println(s1.equals(null));
		
//		StringBuffer sb1 = new StringBuffer("durga");
//		StringBuffer sb2 = new StringBuffer("durga");
//		System.out.println(sb1==sb2);//false
//		System.out.println(sb1.equals(sb2));//false
		Integer i  = new Integer(10);
		System.out.println(i);
		
	}

}
