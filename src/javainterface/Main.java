package javainterface;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[]args) {
		SortEmployee e1= new SortEmployee(101,"hari",10000);
		SortEmployee e2= new SortEmployee(102,"aish",800000);
		SortEmployee e3= new SortEmployee(101,"hari",600000);
		
		List<SortEmployee> em=Arrays.asList(e1,e2,e3);
		List<SortEmployee>updated=em.stream().sorted(Comparator.comparing(SortEmployee::getSalary).reversed())
				.peek(t ->{
					double salary=t.getSalary();
					if(salary>10000) {
						t.setSalary(salary*1.05);
						
					}
					else if(salary>50000) {
						t.setSalary(salary*1.1);
						
					}
				}).collect(Collectors.toList());
		
		updated.forEach(t->System.out.println(t.getEmpName()+" "+t.getSalary()));
		


	}

}
