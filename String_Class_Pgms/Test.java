/*final public class Test{
	private int i;
	
	public static void main(String[] args){
		
	  Test(int i) {
		this.i = i;
		}
		
		public Test modify(int i){
			if(this.i == i){
				return this;
			}
			
			else{
				return(new Test(i));
			}
		}
		
		Test t1 = new Test(10);
		Test t2 = t1.modify(100);
		Test t3 = t1.modify(10);
		
		System.out.println(t1 == t2);
		System.out.println(t1 == t3);
	}
}*/

final public class Test {
  private int i;

  public static void main(String[] args) {

    Test(int i) {
      this.i = i;
    }

    public Test modify(int i) {
      if (this.i == i) {
        return this;
      }

      else {
        return (new Test(i));
      }
    }

    Test t1 = new Test(10);
    Test t2 = t1.modify(100);
    Test t3 = t1.modify(10);

    System.out.println(t1 == t2);
    System.out.println(t1 == t3);
  }
}