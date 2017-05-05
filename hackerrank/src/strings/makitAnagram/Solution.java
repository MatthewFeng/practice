package strings.makitAnagram;

import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */

		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		String t= in.nextLine();
		
		int[] m=new int [26];
		for (int i=0;i<s.length();i++){
			m[s.charAt(i)-'a']++;
		}
		for (int i=0;i<t.length();i++){
			m[t.charAt(i)-'a']--;
		}
		
		int count=0;
		for(int j:m){
			count=count +Math.abs(j);
		}
		System.out.println(count);
		in.close();

	}
}