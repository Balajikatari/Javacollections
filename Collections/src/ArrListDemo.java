import java.util.ArrayList;


public class ArrListDemo {

	public static void main(String[] args) {
		ArrayList alist=new ArrayList();
		alist.add("Balaji");
		alist.add("Pallavi");
		alist.add("Hemanth");
		alist.add("Deepak");
		System.out.println("Elements of ArrayList Collection are  ");
		for(Object ob : alist){
			System.out.println(ob);
		}
		
		alist.add(2,"Sharvari");
		System.out.println("List after Adding new Element...");
		for(Object ob : alist){
			System.out.println(ob);
		}
		
		/* Removing Element by using Index */ 
		
		alist.remove(2);
		System.out.println("List after removing element by Index...");
		for(Object ob : alist){
			System.out.println(ob);
		}
	}
}
