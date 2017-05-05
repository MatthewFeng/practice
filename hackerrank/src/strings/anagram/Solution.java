package strings.anagram;

import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 * https://www.hackerrank.com/challenges/anagram?h_r=next-challenge&h_v=zen
		 */

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		in.nextLine();
		for (int i = 0; i < t; i++) {
			String s = in.nextLine();
			int count = 0;
			if ((s.length() % 2) == 1) {
				System.out.println(-1);
				continue;
			}

			char[] l = s.substring(0, s.length() / 2).toCharArray();
			char[] h = s.substring(s.length() / 2).toCharArray();

			int[] m = new int[26];
			for (char c : l) {
				m[c - 'a']++;
			}
			for (char c : h) {
				m[c - 'a']--;
			}

			for (int k : m) {
				if (k > 0) {
					count = count + k;
				}
			}
			System.out.println(count);
		}

		in.close();

	}
}