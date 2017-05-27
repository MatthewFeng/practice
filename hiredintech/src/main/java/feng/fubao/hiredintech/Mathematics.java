package feng.fubao.hiredintech;

public class Mathematics {

	public static void simplify_fraction(int numerator, int denominator, int[] result) {
		// Write your code here
		// result[0] = ...
		// result[1] = ...

		int g = gcd(numerator, denominator);

		result[0] = numerator/g;
		result[1] = denominator/g;

	}

	public static int gcd(int a, int b) {
		while (b > 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}

		return a;
	}

}
