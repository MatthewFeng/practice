package interview.mthtolast;

import java.io.*;
import java.util.*;


/**
 * 
 * @author Matthew Feng
 *
 */
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);

		int m = in.nextInt();
		in.nextLine();
		String s= in.nextLine();
		
		
		Scanner lineScanner = new Scanner(s);
		
		List l = new ArrayList();
		while (lineScanner.hasNextInt()){
			l.add(lineScanner.nextInt());
		}
		
		
		if (m > l.size()) {
			System.out.println("NIL");
			return;
		} else {
			System.out.println(l.get(l.size() - m));
		}
    }
}