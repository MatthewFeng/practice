package p2;

import java.io.*;
import java.util.*;

/**
 * 
 * @author Matthew Feng
 *
 */
public class Solution {

	static String LookAndSay(String start, int n) {

		if (n==0) return start;
		char[] c = new char[start.length()];
		int[] count = new int[start.length()];
		char[] a = start.toCharArray();

		int j = 0;
		int k = 0;
		for (int i = 0; i < a.length; i++) {
			if (i == 0) {
				c[j] = a[i];
				k++;
				count[j] = k;
			} else if (a[i] == a[i - 1]) {
				k++;
				count[j] = k;
			} else {
				count[j] = k;
				j++;
				c[j] = a[i];
				k = 1;
				count[j]=k;
				
			}

		}

		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < a.length; i++) {
			if (count[i] != 0) {
				sb.append(""+count[i] + c[i]);
			} else {
				break;
			}

		}

		return LookAndSay(sb.toString(), n - 1);
	}

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		final String fileName = "temp2.txt";
		BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
		String res;
		String _start;
		try {
			_start = in.nextLine();
		} catch (Exception e) {
			_start = null;
		}

		int _n;
		_n = Integer.parseInt(in.nextLine());

		res = LookAndSay(_start, _n);
		bw.write(res);
		bw.newLine();

		bw.close();
	}

}