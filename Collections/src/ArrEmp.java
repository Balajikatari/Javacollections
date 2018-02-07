import java.util.ArrayList;
import java.util.Arrays;


public class ArrEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count =0;
		Emp obj1=new Emp(1,"Balaji",58233);
		Emp obj2=new Emp(3,"Deepak",52111);
		Emp obj3=new Emp(4,"Sharvari",85222);
		Emp obj4=new Emp(5,"Balaji",58223);
		Emp obj5=new Emp(2,"Balaji",58243);
		
		Emp [] array = {obj1,obj2,obj3,obj4,obj5};
		
		ArrayList<Emp> arrayobj= new ArrayList<>(Arrays.asList(array));
		
		for(Emp test : arrayobj){
			if(test.j.equalsIgnoreCase("Balaji")){
				count++;
			}
		}
		
		
		/*ArrayList<Emp> alist=new ArrayList<Emp>();
		
		alist.add(obj1);
		alist.add(obj2);
		alist.add(obj3);
		alist.add(obj4);
		alist.add(obj5);
	
		System.out.println("Employ Data ...");
		for(Emp c : alist){
			
			if(c.j.equalsIgnoreCase("Balaji")){
				count++;
			}
			Emp e=(Emp)c;
			System.out.println(e);			
		}*/
		System.out.println(count);
	}
	
}

