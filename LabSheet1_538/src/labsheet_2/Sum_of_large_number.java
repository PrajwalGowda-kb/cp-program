package labsheet_2;

import java.util.*;
public class Sum_of_large_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of element and modulo value: ");
		int n=sc.nextInt();
		long m=sc.nextInt();
		long sum=0;
		long arr[]= new long[n];
		for(int i=0;i<n;i++) {
			//long element=sc.nextLong();
			//sum+=element;
			arr[i]=sc.nextLong();
			sum +=arr[i];
			
		}System.out.println("sum of the element: "+sum);
		long modulo = sum%m;
		System.out.println("modulo of the element: "+modulo);
	}

}
