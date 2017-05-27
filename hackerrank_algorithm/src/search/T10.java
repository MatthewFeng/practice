package search;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class T10 {
	static LinkedList<Integer>[] parents;

	public static void main(String[] args) throws FileNotFoundException {
		// File f = new File("C:\\temp\\t\\in.txt");
		// Scanner sc = new Scanner(new FileInputStream(f));
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int t = sc.nextInt();
		int[] parents = new int[n + 1];

		for (int i = 0; i < n - 1; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			parents[b] = a;
		}

		int count = 0;

		for (int i = 1; i < n + 1; i++) {
			int c = i;
			int p = parents[c];
			while (p > 0) {
				if (Math.abs(p - i) <= t) {
					count++;
				}
				c = p;
				p = parents[c];
			}
		}
		System.out.println(count);
		sc.close();

	}

}
