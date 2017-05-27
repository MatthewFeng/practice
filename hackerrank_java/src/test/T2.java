package test;

import java.util.HashSet;

public class T2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> s = new HashSet<Integer>();

		for (int j = 0; j < 100; j++) {
			for (int i = 0; i < 10; i++) {
				s.add(i);
			}
		}
		System.out.println(s.size());

	}

}
