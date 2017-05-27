package strings.funnyString;

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
		
		for (int i =0;i<t;i++){
			boolean funny=true;
			
			String s=in.nextLine();
			for (int j=1;j<s.length();j++){
				if (Math.abs(s.charAt(j)-s.charAt(j-1))!=
						Math.abs(s.charAt(s.length()-j-1)-s.charAt(s.length()-j))){
					funny=false;
					break;
				}
			}
			if (funny){
				System.out.println("Funny");
			}else{
				System.out.println("Not Funny");
			}
			
		}
	
		in.close();

	}
}