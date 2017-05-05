package sorting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class T16 {

	public static void main(String[] args) throws FileNotFoundException {
		
		File ff= new File("C:\\temp\\t\\in2.txt");
		Scanner sc = new Scanner(new FileInputStream(ff));
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		int f = findDisorder(a, 0);

		int s = findDisorder(a, f + 1);

		swap(a, f, s);

		if (sorted(a)) {

			System.out.println("yes");
			System.out.println("swap " + (f + 1) + " " + (s + 1));
			return;
		} else {
			swap(a, f, s);
		}

		int r = findRevers(a, f + 1);

		reverse(a, f, r);

		if (sorted(a)) {
			System.out.println("yes");
			System.out.println("reverse " + (f + 1) + " " + (r));
			return;
		}

		System.out.println("no");
	}

	private static void reverse(int[] a, int f, int r) {
		r = r - 1;
		while (f < r) {
			swap(a, f, r);
			f++;
			r--;
		}
	}

	private static int findRevers(int[] a, int i) {
		while (i < a.length - 1) {
			if (a[i] <= a[i - 1]) {
				i++;
			} else {
				break;
			}

		}

		return i;
	}

	private static int findDisorder(int[] a, int j) {
		int i = j;
		for (; i < a.length - 2; i++) {
			if (a[i] > a[i + 1]) {
				break;
			}
		}
		return i;
	}

	private static void swap(int[] a, int i, int j) {
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}

	private static boolean sorted(int[] a) {

		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] > a[i + 1])
				return false;
		}
		return true;

	}

}
