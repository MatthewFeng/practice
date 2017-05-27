package introduction.loops;

import java.util.Scanner;

public class T2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {

			try {
				long x = sc.nextLong();
				System.out.println(x + " can be fitted in:");

				if (x >= -128 && x <= 127)
					System.out.println("* byte");
				
				if (x >= (short) 0x8000 && x <= (short) 0x7fff)
					System.out.println("* short");
				
				
				if (x >= 0x80000000 && x <= 0x7fffffff)
					System.out.println("* int");
				if (x >= 0x8000000000000000L && x <= 0x7fffffffffffffffL)
					System.out.println("* long");

				// Complete the code
			} catch (Exception e) {
				System.out.println(sc.next() + " can't be fitted anywhere.");
			}

		}
	}
}
