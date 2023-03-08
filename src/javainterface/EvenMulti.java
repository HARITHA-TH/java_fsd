package javainterface;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenMulti {
	public static void main(String[]args) {
		
	
	List<Integer>s=Arrays.asList(24,67,88,45,90);
	List<Integer>evennumberlist=s.stream().filter(t->t%2==0).map(t->t*t).collect(Collectors.toList());
	System.out.println("Even number is:"+evennumberlist);

	}
}
