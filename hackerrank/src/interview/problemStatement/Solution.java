package interview.problemStatement;

import java.io.*;
import java.util.*;


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
		HashSet s = new HashSet<>();
		Scanner in = new Scanner(System.in);
		
		
		String t = in.nextLine();
		
		
		Scanner in2= new Scanner(t);
		
		in2.useDelimiter(", ");
		while (in2.hasNextInt()){
			int temp = in2.nextInt(); 
			if (s.contains(temp)){
				s.remove(temp);
			}else{
				s.add(temp);
			}
		}
		
		s.forEach(System.out::println );
		in2.close();
		in.close();
		

	}
}