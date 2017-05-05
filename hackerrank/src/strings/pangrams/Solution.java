package strings.pangrams;

import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */

		Scanner in = new Scanner(System.in);
		String s =in.nextLine();
		in.close();
		char[] a=s.toCharArray();
		
		boolean[] m=new boolean[26];
		
		
		for(int i =0;i<s.length();i++){
			char c=a[i];
			if (c>='a'&&c<='z'){
				m[c-'a']=true;
			}else if(c>'A'&&c<'Z'){
				m[c-'A']=true;
			}
		}
		
		for (boolean b:m){
			if (!b){
				System.out.println("not pangram");
				return;
			}
		}
		
		System.out.println("pangram");
	}
}