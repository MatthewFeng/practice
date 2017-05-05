package string.twoStrings;

import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */

		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		
		for (int i = 0; i < t; i++) {
			
			boolean flag=false;
			String a= in.next();
			String b=in.next();
			char[] c=new char[26];
			for (int j = 0; j < c.length; j++) {
				c[j]=0;
			}
			
			for (int k = 0; k < a.length(); k++) {
				c[a.charAt(k)-'a']=1;
			}
			
			for (int k = 0; k < b.length(); k++) {
				if (c[b.charAt(k)-'a']==1){
					System.out.println("YES");
					flag=true;
					break;
				}
			}
			if (!flag){
				System.out.println("NO");
			}
			
		}
	
		in.close();

	}
}