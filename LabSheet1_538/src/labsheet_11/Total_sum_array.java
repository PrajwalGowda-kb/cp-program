package labsheet_11;

import java.util.Scanner;

public class Total_sum_array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = 0;
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println();
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+ " ");
			total+=arr[i];
	}
	System.out.println("\nTotal price = "+total);
		

	}

}
