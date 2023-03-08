package javainterface;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>s=Arrays.asList(24,67,88,45,90);
		List<Integer>evennumberlist=s.stream().filter(t->t%2==0).collect(Collectors.toList());
		System.out.println("Even number is:"+evennumberlist);

	}

}
