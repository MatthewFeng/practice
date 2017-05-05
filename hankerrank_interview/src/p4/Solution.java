package p4;

import java.io.*;
import java.util.*;

public class Solution {

	static String compute(String instructions) {

		boolean hold = false;
		int currentpos = 0;

		int[] r = new int[10];
		char[] a = instructions.toCharArray();
		for (int i = 0; i < a.length; i++) {
			switch (a[i]) {
			case ('P'): {
				if (hold) {
					currentpos = 0;
				} else {
					hold = true;
				}
				break;
			}
			case ('M'): {
				if (currentpos < 9) {
					currentpos++;
				}
				break;
			}
			case ('L'): {
				if (hold&& r[i]<16) {
					r[currentpos]++;
					currentpos = 0;
				}
				break;
			}
			}
		}
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < r.length; i++) {
			sb.append("" + Integer.toHexString(r[i]));
		}
		return sb.toString();

	}

	/**
	 * 
	 * @author Matthew Feng
	 *
	 */
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		final String fileName = "t4";
		BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
		String res;
		String _instructions;
		try {
			_instructions = in.nextLine();
		} catch (Exception e) {
			_instructions = null;
		}

		res = compute(_instructions);
		bw.write(res);
		bw.newLine();

		bw.close();
	}
}
