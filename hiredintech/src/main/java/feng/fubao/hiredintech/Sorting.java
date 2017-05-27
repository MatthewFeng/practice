package feng.fubao.hiredintech;

import java.util.Collections;
import java.util.List;

public class Sorting {

	public static int maximum_completed_tasks(int n, int t, List<Integer> task_difficulties) {
		Collections.sort(task_difficulties);
		int[] a = new int[task_difficulties.size()];

		int k = 0;

		for (Integer in : task_difficulties) {
			a[k] = in;
			k++;
		}

		if (a[0] > t)
			return 0;

		int sum = a[0];
		int count = 1;

		for (int i = 1; i < a.length; i++) {
			sum += a[i] - a[i - 1] + a[i];
			if (sum > t) {
				break;
			} else {
				count++;
			}
		}
		return count;

	}

	public static int cover_the_border(int l, List<List<Integer>> radars) {
		// Example arguments:
		// l = 100
		// radars = [ [5, 10], [3, 25], [46, 99], [39, 40], [45, 50] ]
		// The `radars` list will çonsist of lists with two elements
		Collections.sort(radars, (List<Integer> a, List<Integer> b) -> (a.get(0) - b.get(0)));

		int total = 0;

		int b = 0;
		int e = 0;

		for (List<Integer> p : radars) {

			int p1 = p.get(0);
			int p2 = p.get(1);
			if (p1 < 1) {
				p1 = 1;
			} else if (p1 >l ) {
				continue;

			}
			if (p1<=l&&p2>l){
				p2=l+1;
			}

			if (p1 < e && p2 > e) {
				e = p2;
			} else if (p1 < e && p2 <= e) {

			} else if (p1 > e && p1 <= l && p2 <= l) {
				total += e - b;
				b = p1;
				e = p2;
			}
		}

		total += e - b;
		return total;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
