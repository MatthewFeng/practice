package sorting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class T8 {

	public static void main(String[] args) throws IOException {

		Scanner s = new Scanner (System.in);
		int t = s.nextInt();
		for (int i = 0; i < t; i++) {
			String  ws =s.next();
			
			char[] w = ws.toCharArray();

			boolean find = false;
			for (int j = w.length - 2; j >= 0; j--) {

				for (int k = w.length - 1; k > j; k--) {
					
					if (w[k] > w[j]) {
						find = true;
						char c = w[j];
						w[j] = w[k];
						w[k] = c;
						Arrays.sort(w, j + 1, w.length);
						find = true;
						break;

					}
				}

				if (find)
					break;

			}

			if (!find) {
				System.out.println("no answer");

			} else {
				System.out.println(new String(w)+'\n');
			}
		}

		s.close();
	}

}
