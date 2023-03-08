package javainterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Frequency {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> word=Arrays.asList("Trivandrum","Chennai","Thirunallveli","Trivandrum");
		List<String> wordcount=word.stream().filter(i->Collections.frequency(word,i)>1).collect(Collectors.toList());
		long total=wordcount.stream().count();
		System.out.println(total);

	}
}




