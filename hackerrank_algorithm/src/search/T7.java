package search;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class T7 {
	static HashMap<Integer, Set<Integer>> m = new HashMap<Integer, Set<Integer>>();
	static int[] w;

	public static void main(String[] args) throws FileNotFoundException {
		// File f = new File("C:\\temp\\t\\in.txt");
		// Scanner sc = new Scanner(new FileInputStream(f));
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		w = new int[n + 1];
		int total = 0;
		for (int i = 1; i <= n; i++) {
			w[i] = sc.nextInt();
			total = w[i] + total;
		}

		int[] p = new int[2 * n - 2];

		for (int i = 0; i < n - 1; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			p[2 * i] = a;
			p[2 * i + 1] = b;

			if (m.get(a) == null) {
				Set<Integer> as = new HashSet<Integer>();
				as.add(b);
				m.put(a, as);
			} else {
				m.get(a).add(b);
			}

			if (m.get(b) == null) {
				Set<Integer> bs = new HashSet<Integer>();
				bs.add(a);
				m.put(b, bs);
			} else {
				m.get(b).add(a);
			}

		}

		int min = Integer.MAX_VALUE;

		for (int i = 0; i < n - 1; i++) {
			int l = getWeight(p[2 * i], p[2 * i + 1]);
			int r = total - l;
			int mi = Math.abs(l - r);
			min = min < mi ? min : mi;

		}
		System.out.println(min);
		sc.close();

	}

	private static int getWeight(int i, int j) {
		if (i == j)
			return 0;
		int we = w[i];

		Stack<Integer> st = new Stack<Integer>();
		Stack<Integer> st2 = new Stack<Integer>();
		st.push(i);
		st2.push(j);
		

		while (!st.isEmpty()) {

			Integer e = st.pop();
			Integer e2=st2.pop();
			Set<Integer> s = m.get(e);
			for (Integer k : s) {
				if (!k.equals(e2)) {
					we = we + w[k];
					st.push(k);
					st2.push(e);
				}
			}

		}

		return we;
	}

}
