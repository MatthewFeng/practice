package feng.fubao.hiredintech;

import java.util.Scanner;

public class KMP {

	public static int countAppearance(String s, String p) {
		int[] next = getNext2(p);
		char[] pa = p.toCharArray();
		char[] sa = s.toCharArray();
		int count = 0;
		int j = 0;
		for (int i = 0; i < sa.length;) {
			if (sa[i] == pa[j]) {
				i++;
				j++;
			} else {
				j = next[j];
				if (j == -1) {
					i++;
					j++;
				}
			}

			if (j == pa.length) {
				count++;
				i = i - j + 1;
				j = 0;
			}

		}
		return count;

	}

	/**
	 * 
	 * @param s
	 * @return
	 */
	public static int[] getNext(String s) {
		char[] a = s.toCharArray();
		int[] next = new int[a.length];

		next[0] = -1;

		for (int i = 1; i < a.length; i++) {
			int j = next[i - 1];
			while (j >= 0 && a[i - 1] != a[j])
				j = next[j];// 递推计算

			// if (j < 0 && a[i] == a[0]) {
			// next[i] = j;
			// } else
			if (j >= 0 && a[i - 1] == a[j])
				next[i] = j + 1;
			else
				next[i] = 0;
		}
		return next;
	}

	public static int[] getNext2(String s) {
		char[] pattern = s.toCharArray();

		int[] next = new int[pattern.length];
		next[0] = -1;

		int k = -1, j = 0;

		while (j < pattern.length - 1) {

			while (k != -1 && pattern[k] != pattern[j])
				k = next[k];

			++j;

			++k;

			if (pattern[k] == pattern[j])
				next[j] = next[k];
			else
				next[j] = k;
		}
		return next;

	}

	public static void main(String[] args) {
		// String s = Arrays.toString(getNext2("abcdaabcab"));
		
		// System.out.println(s);
		
//		"abcdaabcab", "ab"

		Scanner sc= new Scanner(System.in);
		String s=sc.nextLine();
		String p=sc.nextLine();
		System.out.println(countAppearance(s, p));
		// TODO Auto-generated method stub

	}

};
