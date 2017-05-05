package oo;

import java.io.IOException;
import java.security.Permission;
import java.util.Scanner;

import oo.Do_Not_Terminate.ExitTrappedException;

class Volume {
	public double main(int x) {
		return x * x * x;
	}

	public double main(double x) {
		return x * x * x * Math.PI * 2 / 3;
	}

	public double main(double l, double b, double h) {
		return l * b * h;
	}

	public double main(double r, double h) {
		return Math.PI * r * r * h;
	}
}

class Out {

	public void display(double volume) {

		System.out.printf("%.3f", volume);
		System.out.println();
	}

}

class Calculate {

	Scanner sc = new Scanner(System.in);

	static Volume v = new Volume();

	Out output = new Out();

	public int getINTVal() throws IOException {

		int i = sc.nextInt();
		if (i <= 0)
			throw new NumberFormatException("All the values must be positive");
		return i;
	}

	public double getDoubleVal() throws IOException {
		double d = sc.nextDouble();
		if (d <= 0)
			throw new NumberFormatException("All the values must be positive");
		return d;
	}

	public static Volume get_Vol() {
		return v;
	}

}

public class T1 {

	public static void main(String[] args) {
		Do_Not_Terminate.forbidExit();
		try {
			Calculate cal = new Calculate();
			int T = cal.getINTVal();
			while (T-- > 0) {
				double volume = 0.0d;
				int ch = cal.getINTVal();
				if (ch == 1) {

					int a = cal.getINTVal();
					volume = Calculate.get_Vol().main(a);

				} else if (ch == 2) {

					int l = cal.getINTVal();
					int b = cal.getINTVal();
					int h = cal.getINTVal();
					volume = Calculate.get_Vol().main(l, b, h);

				} else if (ch == 3) {

					double r = cal.getDoubleVal();
					volume = Calculate.get_Vol().main(r);

				} else if (ch == 4) {

					double r = cal.getDoubleVal();
					double h = cal.getDoubleVal();
					volume = Calculate.get_Vol().main(r, h);

				}
				cal.output.display(volume);
			}

		} catch (NumberFormatException e) {
			System.out.print(e);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Do_Not_Terminate.ExitTrappedException e) {
			System.out.println("Unsuccessful Termination!!");
		}

	}
}

/**
 * This class prevents the user from using System.exit(0) from terminating the
 * program abnormally.
 */
class Do_Not_Terminate {

	public static class ExitTrappedException extends SecurityException {
	}

	public static void forbidExit() {
		final SecurityManager securityManager = new SecurityManager() {
			@Override
			public void checkPermission(Permission permission) {
				if (permission.getName().contains("exitVM")) {
					throw new ExitTrappedException();
				}
			}
		};
		System.setSecurityManager(securityManager);
	}
}// end of Do_Not_Terminate
