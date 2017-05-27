package datastructure;

import java.util.Scanner;

public class T2 {

	/**
	 * +i 0 -i=1 +m=2 -m=3
	 * 
	 * @param i
	 * @param a
	 * @param m
	 * @return
	 */

	public static boolean check(int i, int[] a, int m) {
		if (i <= 0)
			return false;
		if (i >= a.length) {
			return true;
		} else if (a[i] != 0) {
			return false;
		}
		a[i] = 1;
		return check(i - 1, a, m) || check(i + m, a, m) || check(i + 1, a, m);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int n = in.nextInt();
			int m = in.nextInt();
			int[] a = new int[n];
			for (int j = 0; j < n; j++) {
				a[j] = in.nextInt();
			}

			if (check(0 + 1, a, m) || check(0 + m, a, m)) {
				System.out.println("YES");
			} else {

				System.out.println("NO");
			}
		}
		in.close();
	}
}
