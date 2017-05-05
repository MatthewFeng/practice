package newYearChaos;

import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int n = in.nextInt();
			int[] a = new int[n];
			int[] m = new int[n];
			for (int j = 0; j < n; j++) {
				m[j] = 0;
			}
			for (int j = 0; j < n; j++) {
				a[j] = in.nextInt() - 1;
			}

			int index = 0;
			int count = 0;
			boolean tooChao = false;
			
			while (index < n) {
				if (tooChao) break;
				if (a[index] == index) {
					index++;
				} else {
					for (int j = index + 1; j < n; j++) {
						if (tooChao) break;
						
						if (a[j] == index) {
							while (a[index] != index) {
								a[j] = a[j - 1];
								a[j - 1] = index;
								m[a[j]]++;
								count++;
								if (m[a[j]] > 2) {
									tooChao = true;
									break;
								}
								j = j - 1;
							}
							break;
						}
					}
				}
			}

			if (tooChao) {
				System.out.println("Too chaotic");
			} else {
				System.out.println(count);
			}
		}

		in.close();
	}
}