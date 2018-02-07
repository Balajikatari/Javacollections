import java.util.ArrayList;


public class ArrInts {

	public static void main(String[] args) {
		ArrayList alist=new ArrayList();
		
	   alist.add(new Integer(52));
		alist.add(new Integer(34));
		alist.add(new Integer(3));
		alist.add(new Integer(87));
		alist.add(new Integer(31));
	
		int sum=0;
		for(Object ob : alist){
			sum+=(Integer)ob;
		}
		System.out.println("Sum is  " +sum);
	}

}
