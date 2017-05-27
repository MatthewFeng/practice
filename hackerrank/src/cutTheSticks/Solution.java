package cutTheSticks;

import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a= new int [n];
		for (int i = 0; i < n; i++) {
			a[i]=in.nextInt();
		}
		
		Arrays.sort(a);
		
		
		int j=0;
		for (int i = 0; i < n; i++) {
			
			if (a[i]==a[j]){
				
				continue;
				
			}else{
				System.out.println(n-j);
				j=i;
			}
		}
		System.out.println(n-j);
		in.close();

	}
}