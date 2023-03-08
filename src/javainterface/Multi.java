package javainterface;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Multi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>s=Arrays.asList(24,67,88,45,90);
		List<Integer>multilist=s.stream().map(t->t*t).collect(Collectors.toList());
		System.out.println("Even number is:"+multilist);
	}
}