package datastructure;

import java.util.HashSet;
import java.util.Scanner;

public class T4 {
	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		 Scanner s  = new Scanner(System.in);
		 int n =s.nextInt();
		 s.nextLine();
		 HashSet<String > m = new HashSet<String>();
		 for (int i=0;i<n;i++){
			 m.add(s.nextLine());
			 System.out.println(m.size());
		 }
	    }
}
