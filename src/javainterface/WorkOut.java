package javainterface;



import java.util.*;  
import java.util.stream.Collectors;  
class Product{  
    int id;  
    String name;  
    float price;  
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
} 

public class WorkOut {

	public static void main(String[] args) {
		List<Product>productsList=new ArrayList<Product>();
		productsList.add(new Product(1,"lap",700f));
		productsList.add(new Product(2,"mobile",7888f));
		productsList.add(new Product(3,"handsfree",88888f ));
		
		

	}

}
