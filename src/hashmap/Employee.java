package hashmap;
import java.util.HashMap;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Cons>set=new HashMap<Integer,Cons>();
		Cons c1= new Cons(33,56,"hai","eee");
		Cons c2= new Cons(23,58,"haii","eeee");
		Cons c3= new Cons(73,96,"hhai","reee");
		set.put(1, c1);
		set.put(2, c2);
		set.put(3, c3);
		
		
		int HashCode1 = c1.hashCode();
		int HashCode2 = c2.hashCode();

		int HashCode3 = c3.hashCode();
		
		System.out.println("hashcode of c1 c2 c3 is" +  HashCode1 +  HashCode2 +  HashCode3);

		




		
		

	}

}
