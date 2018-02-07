
public class Test {
	
	public int method1(){
		
		int number1 = 6 ; 
		
		number1 +=7;
		System.out.println(number1);
		return number1;
		
	}
	
	
		public static void main(String[] args) {
		
		Test t = new Test();
		int number = t.method1();
		 
		System.out.println(number);
		
		number +=4;
		System.out.println(number);
		
		number = number -9;
		
		System.out.println(number);

	}

}
