package hashmap;

public class Cons{
	int id,age;
	String name,department;
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	public Cons(int id, int age, String name, String department) {
		
		this.id = id;
		this.age = age;
		this.name = name;
		this.department = department;
	}
}


