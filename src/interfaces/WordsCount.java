package interfaces;
import java.util.stream.*;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class WordsCount
{
public static void main(String args[])
{
	System.out.println("Enter String:");
	Scanner sc=new Scanner(System.in);
	String r=sc.nextLine();
	sc.nextLine();
	String v=r.replaceAll("[',!*@;']"," ");//replace special characters with null value
	String [] q=v.split(" ");
	List<String>a=Arrays.asList(q);
	List<String>w=a.stream().map(t->t.toLowerCase()).distinct().sorted().toList();
	System.out.println(w.size());//distinct used for remove duplicate Elements
	System.out.println(a.size());
	w.forEach(System.out::println);
}
}
