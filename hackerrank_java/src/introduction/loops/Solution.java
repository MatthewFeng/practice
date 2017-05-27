package introduction.loops;

import java.io.*;
import java.util.*;


/**
 * 
 * @author Matthew Feng
 *
 */
public class Solution {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i=0;i<t;i++){
			int a= in.nextInt();
			int b=in.nextInt();
			int n= in.nextInt();
			
			int result=a;
			
			for (int j=0;j<n;j++){
			 result=result+(int)Math.pow(2, j)*b;
			 System.out.print(result+" ");
			}
			
			System.out.println();
			
		}
		
	
		in.close();

	}
}