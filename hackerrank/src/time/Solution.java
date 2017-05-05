package time;

import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */

		Scanner in = new Scanner(System.in);
		String t = "12:45:54PM";
//		00:05:39
//		07:05:45PM
		
		
		String h=t.substring(0, 2);
		int ih=Integer.parseInt(h);
		
		
		if (t.contains("AM")){
			if (h.equals("12")){
				System.out.println("00"+t.substring(2,8));
			}else{
				
				System.out.println(t.substring(0, 8));
			}
		}else{
			String nh=""+(ih+12);
			if (ih==12){
				nh="12";
			}
			System.out.println(nh+t.substring(2,8));
		}
		
		in.close();

	}
}