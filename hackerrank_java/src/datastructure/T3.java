package datastructure;

import java.util.HashMap;
import java.util.Scanner;

public class T3 {
	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		HashMap<String, Integer> m = new HashMap<String, Integer>();
		for (int i = 0; i < n; i++) {
			String name = in.nextLine();
			int phone = in.nextInt();
			in.nextLine();
			m.put(name, phone);

		}
		while (in.hasNext()) {
			String s = in.nextLine();
			if (m.containsKey(s)) {
				System.out.println(s + "=" + m.get(s));
			} else {
				System.out.println("Not found");
			}
		}
		in.close();
	}
}
