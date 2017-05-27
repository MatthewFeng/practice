package graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Vector;

public class T1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {

			int n = sc.nextInt();
			int m = sc.nextInt();
			Vector<Integer>[] edges = new Vector[n + 1];
			for (int i = 0; i < edges.length; i++) {
				edges[i] = new Vector<Integer>();
			}

			for (int i = 0; i < m; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				edges[a].add(b);
				edges[b].add(a);
			}

			int s = sc.nextInt();
			int[] d = new int[n + 1];
			bfs(s, edges, d);

			print(d,s);
			System.out.println();

		}
		sc.close();

	}

	private static void print(int[] d,int s) {
		for (int i = 1; i < d.length; i++) {
			if (i!=s){
				if (d[i]!=0){
					System.out.print(d[i]+" ");
				}else{
					System.out.print(-1 + " ");
				}
			}
		}
	}

	private static void bfs(int s, Vector<Integer>[] edges, int[] d) {

		Queue<Integer> q = new LinkedList<Integer>();
		q.add(s);
		while (!q.isEmpty()) {
			int e = q.remove();
			for (Integer i : edges[e]) {
				if (d[i] == 0 &&i!=s){
					d[i] = d[e] + 6;
					q.add(i);
				}
			}

		}

	}

}
