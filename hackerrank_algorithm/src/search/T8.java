package search;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class T8 {
	static int[] w;
	static LinkedList<Integer>[] edges;

	static int[] va;
	static boolean[] visited;

	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("C:\\temp\\t\\in.txt");
		Scanner sc = new Scanner(new FileInputStream(f));
		// Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		w = new int[n + 1];
		edges = new LinkedList[n + 1];

		va = new int[n + 1];
		visited = new boolean[n + 1];
		for (int i = 1; i < n + 1; i++) {
			edges[i] = new LinkedList<Integer>();
		}

		int total = 0;
		for (int i = 1; i <= n; i++) {
			w[i] = sc.nextInt();
			total = w[i] + total;
		}

		for (int i = 0; i < n - 1; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			edges[a].add(b);
			edges[b].add(a);
		}

		int root = -1;
		for (int i = 1; i <= n; i++) {
			if (edges[i].size() > 1) {
				root = i;
			}
		}

		dfs(root);

		int min = Integer.MAX_VALUE;

		for (int i = 1; i < n + 1; i++) {
			if (i != root) {
				int mi = Math.abs(total - 2 * va[i]);
				min = min < mi ? min : mi;

			}
		}
		System.out.println(min);
		sc.close();

	}

	private static int dfs(int root) {
		if (va[root] != 0)
			return va[root];
		if (edges[root].size() == 0) {
			va[root] = w[root];
			return va[root];
		}

		Stack<Integer> s = new Stack<Integer>();

		s.add(root);
		while (!s.isEmpty()) {
			Integer x = s.peek();

			if (edges[x].size() == 0 && !visited[x]) {
				visited[x] = true;
				va[x] = w[x];
				s.pop();
			} else if (!visited[x]) {
				for (Integer e : edges[x]) {
					if (!visited[e]) {
						s.push(e);
					}
				}
				visited[x] = true;
			} else if (visited[x]) {
				va[x] = w[x];
				for (Integer e : edges[x]) {
					va[x] += va[e];
				}
				s.pop();
			}

		}
		return va[root];

	}
	// private static int dfs(int root) {
	//
	// if (va[root] != 0)
	// return va[root];
	// if (edges[root].size() == 0) {
	// va[root] = w[root];
	// return va[root];
	// }
	// va[root] = w[root];
	// for (int e : edges[root]) {
	// va[root] += dfs(e);
	// }
	// return va[root];
	// }
}
