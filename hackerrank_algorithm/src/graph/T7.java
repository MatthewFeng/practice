package graph;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;

public class T7 {

	public static void main(String[] args) throws Exception {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		String[] temp = bfr.readLine().split(" ");
		int N = Integer.parseInt(temp[0]);
		int I = Integer.parseInt(temp[1]);

		ArrayList<HashSet<Integer>> sets = new ArrayList<HashSet<Integer>>();
		boolean [] flag= new boolean[N];
		for (int i = 0; i < I; i++) {
			temp = bfr.readLine().split(" ");
			int a = Integer.parseInt(temp[0]);
			int b = Integer.parseInt(temp[1]);
			flag[a]=true;
			flag[b]=true;
			
			HashSet sa = getSets(sets, a);
			HashSet sb = getSets(sets, b);
			sa.addAll(sb);
			sets.remove(sb);

			// Store a and b in an appropriate data structure of your choice
		}

		long combinations = 0;
		
		int count =0;
		for (int j = 0; j < flag.length; j++) {
			if (!flag[j])
				count++;
		}

		int[] a = new int[sets.size()+count];
		int c = 0;
		for (HashSet<Integer> t : sets) {
			a[c++] = t.size();
		}
		while(count-->0){
			a[c++]=1;
		}
		
		int[] sum = new int[a.length + 1];

		for (int k = 1; k < sum.length; k++) {
			sum[k] = sum[k - 1] + a[k - 1];
		}

		for (int k = 1; k < sum.length; k++) {
			combinations += a[k - 1] * (sum[sum.length - 1] - sum[k]);
		}

		// Compute the final answer - the number of combinations

		System.out.println(combinations);

	}

	private static HashSet getSets(ArrayList<HashSet<Integer>> sets, int a) {
		for (HashSet<Integer> s : sets) {
			if (s.contains(a)) {
				return s;
			}
		}
		HashSet<Integer> ans = new HashSet<Integer>();
		ans.add(a);
		sets.add(ans);
		return ans;
	}

}
