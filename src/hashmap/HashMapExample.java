package hashmap;
import java.util.HashMap;
public class HashMapExample {
	

	public static void main(String[] args){
		HashMap<String,Integer> map=new HashMap<>();
		map.put("hari",22);
		map.put("aysha", 21);
		map.put("ameena",23);
		map.put("aishu",24);
		int age=map.get("hari");
		System.out.println("age of hari is"+ age);
		
		/*boolean containshari = map.containsKey("hari");
		System.out.println("hashmap contains" + containshari);
		
		
		
		map.remove("aysha");
		System.out.println("aysha has been removed");
		
		
		for(String name : map.keySet()){
			int value=map.get(name);
			System.out.println(name + " is " + value + " years old");
		}*/
		
		int hashcode=map.hashCode();
		System.out.println("hashcode of map:" + hashcode);
		
		
		
	}

}
