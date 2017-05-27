package datastructure;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Scanner;

public class T9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Deque<Integer> deque = new ArrayDeque<Integer>();
		int n = in.nextInt();
		int m = in.nextInt();

		int ans = 0;

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < n; i++) {
			int num = in.nextInt();
			deque.addLast(num);

			if (map.containsKey(num)) {
				map.put(num, map.get(num) + 1);
			} else {
				map.put(num, 1);
			}

			if (deque.size() == m) {

				if (ans < map.size()) {
					ans = map.size();
					if (ans == m)
						break;
				}

				Integer e = deque.removeFirst();
				Integer v = map.get(e);
				if (v == 1) {
					map.remove(e);
				} else {
					map.put(e, v - 1);
				}

			}

		}

		System.out.println(ans);
		in.close();

	}
}