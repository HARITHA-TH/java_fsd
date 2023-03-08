package array;

import java.util.Scanner;

public class MaxElement {

	public static void main(String[] args) {
		
			int a[]= {9,3,8,1,7,2};
			int max=a[0];
			for(int i=1;i<a.length;i++) {
				if(a[i]>max) {
					max=a[i];
			System.out.println("the maximum element is:" + max);	
				}
			}

	}

}
