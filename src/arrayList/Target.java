package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Target {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Integer> l = new ArrayList<Integer>(); //List Implementation  
		 l.add(15);
		 l.add(20);
		 l.add(10);
		 l.add(5);
		 l.add(20);
		 l.add(25);
		 //Collections.sort(l);
		 for(int i=0;i<6;i++) {
			 for(int j=i+1;j<6;j++) {
				 if(l.get(i)+l.get(j)==25) {
					 System.out.println(l.get(i));
					 System.out.println(l.get(j));
				 }
			 }
		 }
	}

}
