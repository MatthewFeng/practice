package graph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;



public class T2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {

			int n = sc.nextInt();
			int m = sc.nextInt();
			ArrayList<Edge>[] edges = new ArrayList[n + 1];
			for (int i = 0; i < edges.length; i++) {
				edges[i] = new ArrayList<Edge>();
			}

			for (int i = 0; i < m; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				int r = sc.nextInt();

				edges[a].add(new Edge(b, r));
				edges[b].add(new Edge(a, r));
			}

			int s = sc.nextInt();
			int[] d = new int[n + 1];
			for (int i = 0; i < d.length; i++) {
				d[i] = -1;
			}
			dijkstra(s, edges, d);

			print(d, s);
			System.out.println();

		}
		sc.close();

	}

	private static void dijkstra(int s, ArrayList<Edge>[] edges, int[] d) {

		HashSet<Integer> set = new HashSet<Integer>();

		set.add(s);
		d[s] = 0;
		boolean flag = true;
		while (flag) {
			int next = -1;
			int dis = Integer.MAX_VALUE;
			flag = false;
			for (Iterator<Integer> iterator = set.iterator(); iterator.hasNext();) {
				Integer integer = (Integer) iterator.next();

				for (Edge e : edges[integer]) {
					if (d[e.node] == -1) {
						flag = true;

						if (d[integer] + e.value < dis) {
							next = e.node;
							dis = d[integer] + e.value;
						}
					}
				}
			}
			if (next != -1) {
				set.add(next);
				d[next] = dis;
			}
		}

	}

	private static void print(int[] d, int s) {
		for (int i = 1; i < d.length; i++) {
			if (i != s) {
				if (d[i] != 0) {
					System.out.print(d[i] + " ");
				} else {
					System.out.print(-1 + " ");
				}
			}
		}
	}
}
	class Edge {
		Edge(int node, int value) {
			this.node = node;
			this.value = value;
		}

		int node;
		int value;
	}



