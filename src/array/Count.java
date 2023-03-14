//To print count of positive and negative numbers in an array

package array;

public class Count {

	public static void main(String[] args) {
		int a[]= {4,-4,6,8,-9,0,4,-7,56};
		int cp=0;
		int cn=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]<0) {
				cn+=1;
			}
			
			else if(a[i]>0) {
				cp+=1;
			}
			else {
				System.out.println("zero is neutral");
			}
		}
		System.out.println("Total positive numbers:" + cp);
		System.out.println("Total negative numbers:" + cn);

		
		
		

	

}
}
