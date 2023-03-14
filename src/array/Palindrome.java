


//to find palindrome of a number

package array;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		int num;
		int digit;
		int rev=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		num=sc.nextInt();
		int temp=num;
		while(num>0) {
			digit=num%10;
			rev=rev*10+digit;
			num=num/10;
		}
		if(rev==temp) {
			System.out.println("The number is palindrome");
		}
		else {
			System.out.println("The number is not palindrome");

		}

	}

}
