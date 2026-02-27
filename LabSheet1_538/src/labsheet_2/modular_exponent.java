package labsheet_2;
import java.util.Scanner;

public class modular_exponent {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the integer a m p:");
		int a=sc.nextInt();
		int m=sc.nextInt();
		int p=sc.nextInt();
		int result=1;
		while(m>0) {
			result *=a;
			m--;
			/*if(m%2==1) {
				result=result*a;
				m--;
				
			}
			else {
				a=a*a;
				m=m/2;
			}*/
		}
		System.out.println(result%p);
				
			}
		
	}


