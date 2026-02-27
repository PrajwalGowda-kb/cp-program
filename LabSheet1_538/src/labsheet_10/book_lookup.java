package labsheet_10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class book_lookup {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
       
        HashMap<String,Integer> hash = new HashMap<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
        	String str = sc.next();
            int id = sc.nextInt(); 
            hash.put(str,id);
        }
          
        int q = sc.nextInt();
        ArrayList<String> results = new ArrayList<>();
          
        for (int i = 0; i < q; i++) {
            String search = sc.next();
            if (hash.containsKey(search)) {
                results.add(String.valueOf(hash.get(search)));
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




