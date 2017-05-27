package strings.palindromeIndex;

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
		in.nextLine();
		for (int i = 0; i < t; i++) {
			String s = in.nextLine();
			if (isPalindrome(s,0,s.length()-1)) {
				System.out.println(-1);
				continue;
			}
			
			boolean find = false;
			
			int l=0;
			int h=s.length()-1;
			while(l<h){
				if (s.charAt(l)!=s.charAt(h)){
					if (isPalindrome(s,l+1,h)){
						System.out.println(l);
						find = true;
						break;	
					}
					if (isPalindrome(s,l,h-1)){
						System.out.println(h);
						find = true;
						break;	
					}
				}
				l++;
				h--;
			}
	
			if (!find) {
				System.out.println(-1);
			}
		}

		in.close();

	}

	private static boolean isPalindrome(String s,int x,int y) {
		int l=x;
		int h=y;
		while(l<h){
			
			if (s.charAt(l)!=s.charAt(h)){
				return false;
			}
			l++;
			h--;
			
		}
		
		return true;
	}
}