package labsheet_1;
import java.util.*;
public class Discount_Calculater {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Amount: ");
		
		int num = sc.nextInt();
		
		if(num<1000) {
			System.out.println("Final payable amount: "+ num);
		}
		else if((num>=1000)&&(num<5000)) {
			num = num-(num/10);
			System.out.println("Final payable amount: "+ num);
		}
		else if((num>=5000)&&(num<10000)) {
			num = num-(num/5);
			System.out.println("Final payable amount: "+ num);
		}
		else {
			num = num-(num/4);
			num = num-500;
			System.out.println("Final payable amount: "+ num);
		}
			

	}

}
