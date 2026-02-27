package labsheet_6;
import java.util.*;
public class unique_no_using_XOR {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[] = new int[n];
		int ans=0;
		for(int i=0;i<n; i++) {
			arr[i]=sc.nextInt();
			ans=ans^arr[i];
		}
		System.out.println(ans);
	}

}
