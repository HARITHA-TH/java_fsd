package javainterface;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Hotel {
	public static void main (String[]args) {
		Customer c1= new Customer("133","hari",9645,"harithath003@gmail.com","ernakulam");
		Customer c2= new Customer("113","aysha",1645,"aysha113@gmail.com","trivandrum");
		Customer c3= new Customer("193","aami",9645,"aami890@gmail.com","chennai");
		Customer c4= new Customer("123","aish",9645,"aish003@gmail.com","malapuram");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any register ID:");
		String a=sc.next();
		
	   // List<Customer>list=Arrays.asList(c1,c2,c3,c4);
	    //Customer l2=list.stream().filter(findEmp->a.equals(findEmp.getRegid())).findAny().orElse(null);
	    List<Customer>list=Arrays.asList(c1,c2,c3,c4);
	    List<Customer>l2=list.stream().filter(val->val.getRegid().equals(a)).collect(Collectors.toList());		
		if (l2.isEmpty()){
			System.out.println("list is empty");
		}
		else {
			for(Customer cc:l2) {
				System.out.println("ID:" + cc.getRegid() + "\n" + "Phone Number" + cc.getPhno() + "\n" + "emailis:" + cc.getEmail() + "\n" + "location is:" + cc.getLoc());
			}
		}


		

	}

}
