package graph;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class T6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		ArrayList<Integer>[] edges = new ArrayList[n + 1];
		for (int i = 0; i < edges.length; i++) {
			edges[i] = new ArrayList<Integer>();
		}

		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			edges[a].add(b);
			edges[b].add(a);
		}

		sc.close();

		int ans = lsd(1, edges);
		System.out.println(ans);
	}

	private static int lsd(int i, ArrayList<Integer>[] edges) {
		int ans = 0;
		Stack<Integer> s = new Stack<Integer>();
		s.add(i);
		boolean[] flag = new boolean[edges.length];
		int[] count = new int[edges.length];

		while (!s.empty()) {
			int t = s.peek();
			if (!flag[t]) {
				for (int c : edges[t]) {
					if (!flag[c]) {
						s.push(c);

					}
				}
				flag[t] = true;
			} else {
				s.pop();

				for (int c : edges[t]) {
					count[t] += count[c];
				}
				count[t]++;
				if (count[t] % 2 == 0 && edges[t].size() > 1 && t != 1) {
					ans++;
					System.out.println(t);
				}

			}
		}

		return ans;

	}

}
