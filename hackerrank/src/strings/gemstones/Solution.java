package strings.gemstones;

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
		int[] count=new int[26];
		
		for(int i=0;i<t;i++){
			char[] a=in.nextLine().toCharArray();
			int[] co=new int[26];
			for(char c:a){
				co[c-'a']=1;
			}
			for(int y=0;y<count.length;y++){
				count[y]=count[y]+co[y];
			}
		}
		
		int finalcount=0;
		for(int k:count){
			if (k==t){
				finalcount++;
			}
		}
		System.out.println(finalcount);
	
		in.close();

	}
}