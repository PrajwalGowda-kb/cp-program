package labsheet_1;
import java.util.Scanner;
public class Discount_Rules {

	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the number of item in order: ");
			int n=sc.nextInt();
			int total=0;
			for(int i=1;i<=n;i++) {
				int price=sc.nextInt();
				int discount =sc.nextInt();
				price=price-(price*discount/100);
				total=total+price;
				
			}
			System.out.println("Total bill after item level dicount: "+total);
			
			int  pdiscount = 0;
			int  fdiscount = 0;
			
			if(total>500) {
				pdiscount= total*10/100;
			}
			if(total>1000) {
				fdiscount= 150;
			}
			
			if(pdiscount>fdiscount) {
				total=total-pdiscount;
			}else{
				total=total-fdiscount;
				
			}
			System.out.println("Total bill after all dicount: "+total);
		}

	

}
