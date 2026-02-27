package labsheet_9;
import java.util.Scanner;
public class Linear_search {
		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int []a=new int[n];
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			int k=sc.nextInt();
			boolean found = false;
			for (int i = 0; i < n; i++) {
	            if (a[i] == k) {         
	                System.out.println(i); 
	                found = true;
	                break;                 
	            }
	        }
	        
	        if (!found) {                  
	            System.out.println("Not found");
	      }else {
	    	  System.out.println("found");
	      }
	    	  

	}
			

}

	
