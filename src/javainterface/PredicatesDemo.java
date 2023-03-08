package javainterface;

import java.util.function.Predicate;

public class PredicatesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer>p=t->t%2==0;
		System.out.println(p.test(45));
	}

}
