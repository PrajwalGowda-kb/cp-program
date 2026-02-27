package labsheet_3;
import java.util.*;
public class modular_power_sum1 {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number of pairs and modulo: ");
			int n=sc.nextInt();
			int p=sc.nextInt();
			int sum=0;
			System.out.println("Enter two integers a_i and m_i: ");
			for(int i=1;i<=n;i++) {
				int a_i=sc.nextInt();
				int m_i=sc.nextInt();
				sum=(sum+power(a_i,m_i,p))%p;
			}
			System.out.println(sum);

		}
		public static int power(int a_i,int m_i,int p) {
			int result=1;
			while(m_i>0) {
				result *=a_i;
				m_i--;
			/*	if(m_i%2==1) {
					result=result*a_i;
					m_i--;
					
				}
				else {
					a_i=a_i*a_i;
					m_i=m_i/2;
				}*/
			}
			return result;
			
		}

	}
