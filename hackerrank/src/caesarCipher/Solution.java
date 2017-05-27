package caesarCipher;

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
		String s=in.next();
		char k=(char)in.nextInt();
		k=(char)(k%26);
		
		char[] a = s.toCharArray();
		
		for(int j=0;j<a.length;j++){
			char c=a[j];
			if (c>='a'&&c<='z'){
				char r=(char) (c+k);
				if (r>'z'){
					r=(char)(r-26);
				}
				a[j]=r;
			}else
			
			if (c>='A'&&c<='Z'){
				char r=(char) (c+k);
				if (r>'Z'){
					r=(char)(r-26);
				}
				a[j]=r;
			}
		}
		

		System.out.println(new String(a));
		in.close();

	}
}