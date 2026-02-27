package labsheet_3;
import java.util.*;
public class modular_mul_checker {


		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			//System.out.print("Enter the three integer a,b,and p: ");
			long a=sc.nextLong();
			long b=sc.nextLong();
			long p=sc.nextLong();
			long k=sc.nextLong();
			long p1=a%p;
			long p2=b%p;
			
			long result = (p1*p2)%p;
		
			if(result%k==0) {
				System.out.println("Divisible");
			}else
				System.out.println("not Divisible");
			
		}

	


}
