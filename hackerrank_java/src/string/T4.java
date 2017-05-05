package string;

import java.util.ArrayList;
import java.util.Scanner;

public class T4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		// Complete the code
		ArrayList a = new ArrayList();

		int l = 0;
		int h = 0;
		boolean begin = false;
		while (h < s.length()) {
			char c = s.charAt(h);
			if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
				if (!begin) {
					l = h;
					begin = true;
				}
				h++;
			} else if (!begin) {
				h++;
			}else {
				a.add(s.substring(l,h));
				begin=false;
			}
		}
		
		if (begin) 	a.add(s.substring(l,h));
		
		System.out.println(a.size());
		for (Object o:a){
			System.out.println(o);
		}
		
	}
}