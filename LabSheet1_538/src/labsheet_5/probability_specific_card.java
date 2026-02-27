package labsheet_5;
import java.util.Scanner;
public class probability_specific_card {
		static long comb(int n,int k) {
			long res=1;
			if(k>n) {
				System.out.println("stop");
			}else {
				int nk= n-k;
				if(nk<k) {
					k=nk;
				}
	
				for(int i=1;i<=k;i++)
					res = res*(n-i+1)/i;
				}
				     return res;
		}
	
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int k=sc.nextInt();
			int r=sc.nextInt();
			float a=(comb(13,r)*comb(39,k-r));
			float b=comb(52, k);
			float prob=a/b;
			System.out.printf("%.6f",prob);
			}
}
