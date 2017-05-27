package plusminus;

import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */

		Scanner in = new Scanner(System.in);
		int l = in.nextInt();
		float p = 0;
		float z = 0;
		float m = 0;
		
		for (int i = 0; i < l; i++) {
			int t = in.nextInt();
			if (t==0){
				z++;
			}else if (t>0){
				p++;
			}else{
				m++;
			}
			
		}
		
		in.close();		
	
		System.out.printf("%7.6f",p/l);
		System.out.println();
		System.out.printf("%7.6f",m/l);
		System.out.println();
	    System.out.printf("%7.6f",z/l);

	}
}