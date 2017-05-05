package string;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class T5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while (testCases > 0) {
			String pattern = in.nextLine();
			boolean flag = true;
			try {
				Pattern r = Pattern.compile(pattern);
			} catch (PatternSyntaxException e) {
				flag = false;
			}
			if (flag) {
				System.out.println("Valid");
			} else {
				System.out.println("Invalid");
			}
			testCases--;
		}
	}
}