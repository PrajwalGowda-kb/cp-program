package labsheet_5;

import java.util.Scanner;

public class Quality_inspection_pro_in_manufacture {

	
		static long comb(int n,int k) {
			long res=1;
			int nk= n-k;
				if(nk<k) {
					k=nk;
				}
	
				for(int i=1;i<=k;i++)
					res = res*(n-i+1)/i;
				
				     return res;
		}
	
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int d=sc.nextInt();
			int k=sc.nextInt();
			int r=sc.nextInt();
			float a=comb(d,r)*comb((n-d),(k-r));
			float b=comb(n, k);
			float prob=a/b;
			System.out.printf("%.6f",prob);
			}


	}


