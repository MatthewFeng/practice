package patternSyntaxChecker;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * 
 * @author Matthew Feng
 *
 */
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
			boolean flag = true;
			String s = in.nextLine();
			try {
				Pattern.compile(s);
			} catch (PatternSyntaxException e) {
				flag = false;
			}
			if (flag) {

				System.out.println("Valid");
			} else {
				System.out.println("Invalid");
			}
		}

		in.close();

	}
}