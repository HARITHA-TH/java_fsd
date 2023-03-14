//to find lucky numbers

package array;

import java.util.Scanner;

public class LuckyNumber {

	public static void main(String[] args) {
		int num;
		int digit;
		int flag1=0;
		int flag2=0;
		int flag3=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		num=sc.nextInt();
		
		while(num>0) {
			digit=num%10;
			if(digit==3) {
				flag1=1;
			}
			if(digit==6) {
				flag2=1;
			}
			if(digit==3) {
				flag3=1;
			}
			num=num/10;
		}
		if(flag1==1 && flag2==1 && flag3==1) {
			System.out.println("Lucky number");
		}
		else {
			System.out.println("Not lucky number");
		}

	}

}
