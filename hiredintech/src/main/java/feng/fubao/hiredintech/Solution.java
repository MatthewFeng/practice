package feng.fubao.hiredintech;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
	public static boolean is_numeric_palindrome(long number) {
		if (number < 0)
			return false;
		String s = "" + number;
		char[] a = s.toCharArray();
		int l = 0;
		int h = a.length - 1;
		while (h >= l && a[l] == a[h]) {
			l++;
			h--;
		}
		if (h - l > 0) {
			return false;
		} else {
			return true;
		}

	}

	public static List<Integer> longest_increasing_subsequence2(List<Integer> sequence) {
		// Write your solution here

		int max = 0;

		int[] a = new int[sequence.size()];

		int k = 0;
		for (Integer i : sequence) {
			a[k] = i;
			k++;
		}
		int[] m = new int[a.length + 1];
		int[] p = new int[a.length];

		int h = 2; // the high level of the array m;

		for (int i = 0; i < p.length; i++) {
			p[i] = -1;
			m[i] = -1;
		}
		m[p.length] = -1;

		m[1] = 0;

		for (int i = 1; i < a.length; i++) {
			int index = locate(a, i, m, h);
			if (index == 0) {
				m[index + 1] = i;
				p[i] = -1;
				continue;
			} else {
				m[index] = i;
				p[i] = m[index - 1];
			}
			h = Math.max(index + 1, h);
		}

		for (int i = 1; i < m.length; i++) {
			if (i == m.length - 1 || m[i + 1] < 0) {
				max = i;
				break;
			}
		}
		ArrayList<Integer> r = new ArrayList<Integer>(max);

		r.add(a[m[max]]);
		int t = p[m[max]];

		while (t >= 0) {
			r.add(a[t]);
			t = p[t];
		}

		Collections.reverse(r);
		return r;

	}

	private static int locate(int[] a, int i, int[] m, int h) {
		// TODO Auto-generated method stub

		int l = 1;
		int hi = h;
		int k = a[i];
		int mi = (l + hi) / 2;
		while (((l < hi) && (k != a[m[mi]]))) {

			if (k > a[m[mi]]) {
				l = mi + 1;

			} else if (k < a[m[mi]]) {
				hi = mi - 1;
			}
			mi = (l + hi) / 2;
		}

		if (mi == h) {
			return mi;
		}
		if (mi == 0 || k > a[m[mi]]) {
			return mi + 1;
		}
		return mi;
	}

	public static List<Integer> longest_increasing_subsequence(List<Integer> sequence) {
		// Write your solution here

		int max = 0;

		int[] a = new int[sequence.size()];

		int k = 0;
		for (Integer i : sequence) {
			a[k] = i;
			k++;
		}

		int longest[] = new int[a.length];

		for (int i = 0; i < longest.length; i++) {
			longest[i] = 1;
		}
		for (int i = 1; i < a.length; i++) {
			for (int j = 0; j < i; j++) {
				if (a[i] > a[j])
					longest[i] = Math.max(longest[j] + 1, longest[i]);
			}
		}

		for (int i = 0; i < longest.length; i++) {
			max = Math.max(longest[i], max);
		}

		int[] l = new int[max];
		int next = max;
		int j = l.length - 1;
		int cur = Integer.MAX_VALUE;
		for (int i = a.length - 1; i >= 0; i--) {
			if (longest[i] == next && a[i] < cur) {
				l[j] = a[i];
				next--;
				j--;
				cur = a[i];
			}
		}

		ArrayList<Integer> r = new ArrayList<Integer>(l.length);
		for (int i = 0; i < l.length; i++) {
			r.add(l[i]);
		}

		return r;

	}

	public static void main(String[] ar) {
		List<Integer> a = new ArrayList<Integer>(Arrays.asList(1, 3, 2, 4));
		List<Integer> r = Solution.longest_increasing_subsequence2(a);

		for (Integer i : r) {
			System.out.println(i);
		}
	}

	public static int count_the_paths(List<String> grid) {
		// Write your solution here
		int n = grid.size();
		if (n == 0)
			return 0;
		int m = grid.get(0).length();

		char[][] g = new char[n][m];

		int k = 0;
		for (String s : grid) {
			g[k] = s.toCharArray();
			k++;
		}

		int[][] p = new int[n][m];
		p[n - 1][0] = 1;

		for (int i = n - 1; i >= 0; i--) {
			for (int j = 0; j < m; j++) {
				if (g[i][j] != '1') {
					if (i <= n - 2 && g[i + 1][j] == '0') {
						p[i][j] = p[i][j] + p[i + 1][j];
					}
					if (j >= 1 && g[i][j - 1] == '0') {
						p[i][j] = p[i][j] + p[i][j - 1];
					}
					p[i][j] %= 1000003;
				}

			}
		}

		return p[0][m - 1];

	}

}
