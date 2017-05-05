package modifiedKaprekarNumbers;

import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */

		Scanner in = new Scanner(System.in);
		int p = in.nextInt();
		int q = in.nextInt();
		List<Integer> list = new ArrayList<Integer>();

		for (int i = p; i <= q; i++) {
			long  s = ((long)i) * i ;
			String ss = "" + s;
			int length = ss.length();
			String ls=ss.substring(0, length / 2 );
			int l=0;
			if (!"".equals(ls)) {
				l = Integer.parseInt(ls);
			}
			
			String rs = ss.substring(length / 2 , ss.length());
			int r = 0;
			if (!"".equals(rs)) {
				r = Integer.parseInt(rs);
				if (r==0){
					continue;
				}
			}
			if (i == l + r) {
				list.add(i);
			}

		}
		
		if(list.size()>0){
		for (Integer e:list){
			System.out.print(e+" ");
		}}
		else{
			System.out.println("INVALID RANGE");
		}

		in.close();

	}
}