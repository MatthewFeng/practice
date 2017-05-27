package exception;

import java.util.Scanner;

class Add {
	void add(int... a) {
		int sum = 0;
		StringBuffer sb = new StringBuffer();
		for (int x : a) {
			sb.append(x);
			sb.append("+");
			sum = sum + x;
		}
		sb.deleteCharAt(sb.length() - 1);
		sb.append("=" + sum);
		System.out.println(sb);
	}
}
	class myCalculator {

		double power(int n, int p) throws Exception {
			if (n < 0 || p < 0) {
				throw new Exception("n and p should be non-negative");
			}
			return Math.pow(n, p);
		}

	}

public class T2 {

    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);

        while(in.hasNextInt())
        {
            int n = in.nextInt();
            int p = in.nextInt();
            myCalculator M = new myCalculator();
            try
            {
                System.out.println(M.power(n,p));
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }

    }
}
