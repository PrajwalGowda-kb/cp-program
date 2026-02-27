package labsheet_4;
import java.util.*;
public class Team_selection_count {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		if(k>n) {
			System.out.println("stop");
		}else {
			int nk= n-k;
			if(nk<k) {
				k=nk;
			}
		
			int res=1;
			for(int i=1;i<=k;i++) {
				res = res*(n-i+1)/i;
			}
			System.out.println(res);
		}
	}
}
