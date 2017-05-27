package graph;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class T4 {
	static LinkedList<HashSet<Integer>> set = new LinkedList<HashSet<Integer>>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		Edge4[] edges = new Edge4[m];

		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int r = sc.nextInt();

			edges[i] = new Edge4(a, b, r);

		}

		int s = sc.nextInt();

		HashSet<Edge4> ans = new HashSet<Edge4>();
		kruskal(s, edges, ans);

		int w = 0;
		for (Edge4 e : ans) {
			w += e.value;
		}
		System.out.println(w);

		sc.close();

	}

	private static void kruskal(int s, Edge4[] edges, HashSet<Edge4> ans) {
		Arrays.sort(edges, new Comparator<Edge4>() {

			@Override
			public int compare(Edge4 o1, Edge4 o2) {

				return Integer.compare(o1.value, o2.value);
			}

		});

		for (Edge4 e : edges) {
			if (!isCycle(e)) {
				ans.add(e);
			}
		}

	}

	private static boolean isCycle(Edge4 e) {

		HashSet<Integer> sa = find(e.a);
		HashSet<Integer> sb = find(e.b);
		if (sa == sb)
			return true;
		sa.addAll(sb);
		sb.clear();
		set.remove(sb);
		return false;
	}

	private static HashSet<Integer> find(int a) {
		for (HashSet<Integer> s : set) {
			if (s.contains(a)) {
				return s;
			}
		}
		HashSet<Integer> ans = new HashSet<Integer>();
		ans.add(a);
		set.add(ans);
		return ans;
	}

}

class Edge4 {
	Edge4(int a, int b, int value) {
		this.a = a;
		this.b = b;
		this.value = value;
	}

	int a;
	int b;
	int value;
}
