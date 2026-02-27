package labsheet_6;
import java.util.*;
public class network_package_integretity_XOR {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[] = new int[n];
		int c_s=sc.nextInt();
		int ans=0;
		for(int i=0;i<n; i++) {
			arr[i]=sc.nextInt();
			ans=ans^arr[i];
		}
		if(ans == c_s) {
			System.out.println("OK");
		}else {
			System.out.println("ANOMALY");
		}
		
	}

}
