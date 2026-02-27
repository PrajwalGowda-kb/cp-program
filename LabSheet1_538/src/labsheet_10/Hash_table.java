package labsheet_10;

import java.util.HashSet;
import java.util.Scanner;
import java.util.ArrayList;

public class Hash_table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<String> str = new HashSet<>(n);
      
        for (int i = 0; i < n; i++) {
            str.add(sc.next());
        }
          
        int q = sc.nextInt();
        ArrayList<String> results = new ArrayList<>();
          
        for (int i = 0; i < q; i++) {
            String search = sc.next();
            if (str.contains(search)) {
                results.add("found");
            } else {
                results.add("not found");
            }
        }
          
        for (String result : results) {
            System.out.println(result);
        }
          
        sc.close();
    }
}

	  
/*import java.util.HashSet;
import java.util.Scanner;

public class Hash_table {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		HashSet<String> str=new HashSet<String>(n);
		for(int i=0;i<n;i++) {
			str.add(sc.next());
			
		}
		int q=sc.nextInt();
		for(int i=0;i<q;i++) {
			String search=sc.next();
			if(str.contains(search)) {
				System.out.println("found");
			}
			else {
				System.out.println("not found");
			}
		}
	}
}*/