package prime;

import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import static java.lang.System.in;
import java.io.BufferedReader;

class Prime {

	public static void checkPrime(int... a) {
		for (int i = 0; i < a.length; i++) {

			boolean isprime = true;
			if (a[i] == 1 )
				isprime = false;
			for (int j = 2; j <= a[i] / 2; j++) {
				if (a[i] % j == 0) {
					isprime = false;
				}
			}
			if (isprime) {
				System.out.print(a[i] + " ");
			}
		}
		System.out.println();

	};

}

public class Solution {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			Random rand = new Random();
			int n = rand.nextInt();
			Prime ob = new Prime();
			ob.checkPrime(4);

			Prime.checkPrime(9, 10, 32, 89, 66);
			Prime.checkPrime(19, 78, 98, 100, 787, 8989, 12817, 11, 192);
			Prime.checkPrime(90, 2, 31, 890, 8278, 87892, 12, 10);
			Method[] methods = Prime.class.getDeclaredMethods();
			Set<String> set = new HashSet<>();
			boolean overload = false;
			for (int i = 0; i < methods.length; i++) {
				if (set.contains(methods[i].getName())) {
					overload = true;
					break;
				}
				set.add(methods[i].getName());

			}
			if (overload) {
				throw new Exception("Overloading not allowed");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}