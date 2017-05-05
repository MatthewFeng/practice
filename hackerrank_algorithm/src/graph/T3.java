package graph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class T3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		ArrayList<Edgex>[] edges = new ArrayList[n + 1];
		for (int i = 0; i < edges.length; i++) {
			edges[i] = new ArrayList<Edgex>();
		}

		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int r = sc.nextInt();

			Edgex x = new Edgex(a, b, r);

			edges[a].add(x);
			edges[b].add(x);
		}

		int s = sc.nextInt();

		HashSet<Edgex> ans = new HashSet<Edgex>();
		mst(s, edges, ans);

		int w = 0;
		for (Edgex e : ans) {
			w += e.value;
		}

		System.out.println(w);

		sc.close();

	}

	private static void mst(int s, ArrayList<Edgex>[] edges, HashSet<Edgex> ans) {
		HashSet<Integer> v = new HashSet<Integer>();
		v.add(s);
		while (v.size() < edges.length - 1) {

			int d = Integer.MAX_VALUE;
			int next = 0;
			Edgex nexte = new Edgex(0, 0, 0);
			for (int n : v) {

				for (Edgex e : edges[n]) {
					if (!ans.contains(e) && !(v.contains(e.a) && v.contains(e.b)) && d > e.value) {
						next = e.a == n ? e.b : e.a;
						d = e.value;
						nexte = e;
					}
				}

			}
			v.add(next);
			ans.add(nexte);

		}

	}

}

class Edgex {
	Edgex(int a, int b, int value) {
		this.a = a;
		this.b = b;
		this.value = value;
	}

	int a;
	int b;
	int value;
}
