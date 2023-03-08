package arrayList;
import java.util.*;

public class AddToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String> l = new ArrayList<>(); //List Implementation  
         l.add("Sam");  //adding objects to list  
         l.add("Sandy");  
         l.add("Joe");  
         l.add("Arya");  
         l.add("Nik");  
         l.add("hari");
         System.out.println("List objects are:  " +l); // printing the list  
         l.remove("Nik"); //removing objects from list  
         System.out.println("After Removing Nik, List Objects are" +l);  
	}

}
