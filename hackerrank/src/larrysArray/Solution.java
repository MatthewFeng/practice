package larrysArray;

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
			for (int j = 0; j < n; j++) {
				a[j] = in.nextInt() - 1;
			}
			int index = 0;
			boolean sortable = true;
			while (index < n) {

				if (sortable == false)
					break;
				if (a[index] == index) {
					index++;
				} else {
					for (int j = index + 1; j < n; j++) {

						if (a[j] == index) {

							if (j >= index + 2) {

								if ((j==(index+2))&&((a[j - 2] == (index + 2)) && a[j - 1] == (index + 1))) {
									sortable = false;
									break;
								}
								a[j] = a[j - 1];
								a[j - 1] = a[j - 2];
								a[j - 2] = index;
							} else if(j==(n-1)){
								sortable = false;
								break;
							}else{
								a[j] = a[j + 1];
								a[j + 1] = a[j - 1];
								a[j - 1] = index;
							}
							
//							System.out.println(Arrays.toString(a));
							break;
						}
					}
				}
			}

			if (sortable) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}

		}

		in.close();

	}
}