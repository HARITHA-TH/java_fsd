package javainterface;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Cities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> s=Arrays.asList("Trivandrum","Chennai","Thirunallveli");
		List<String> Cities=s.stream().filter(t->t.startsWith("T")).collect(Collectors.toList());
		System.out.println("Cities are:"+Cities);

	}

	

}
