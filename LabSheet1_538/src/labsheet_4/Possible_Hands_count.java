package labsheet_4;
import java.util.Scanner;
public class Possible_Hands_count {

		public static int factorial(int n) {
			int res=1;
			if(n==0) {
				return 0;
			}else {
				for(int i=1;i<=n;i++)
				res=res*i;
			}
			return res;	
		}
		public static int Possible_Hands_count(int n, int k) {
			int rest=factorial(n)/(factorial(k)*(factorial(n-k)));
			return rest;
		}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int N=sc.nextInt();
			int K=sc.nextInt();
			
			double possible=Possible_Hands_count(N, K);
			
			System.out.println(possible);

		}

	}

	

