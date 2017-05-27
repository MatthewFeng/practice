package sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class T6 {

	static void quickSort(int[] ar) {
		quickSort(ar, 0, ar.length - 1);

	}

	private static void quickSort(int[] ar, int i, int j) {
		if (i >= j)
			return;

		int m = partition(ar, i, j);
		quickSort(ar, i, m - 1);
		quickSort(ar, m + 1, j);
		printArray(ar, i, j);

	}

	private static void printArray(int[] ar, int i, int j) {
		for (int k = i; k <= j; k++) {
			System.out.print(ar[k] + " ");
		}
		System.out.println();
	}

	 static void copy(ArrayList<Integer> list, int ar[], int startIdx)
     {
             for(int num : list)
            {
               ar[startIdx++] = num;      
            }
     }
	 
	 
	static int partition(int[] ar, int minpos, int maxpos) {
		int p = ar[minpos];
        ArrayList<Integer> leftlist = new ArrayList<Integer>();
        ArrayList<Integer> rightlist = new ArrayList<Integer>();

        for(int i = minpos+1 ; i <= maxpos; i++)
            {
               if(ar[i] > p)
                   rightlist.add(ar[i]);
               else
                   leftlist.add(ar[i]);
            }
        copy(leftlist,ar,minpos);
        int ppos = leftlist.size()+minpos;
        ar[ppos] = p;
        copy(rightlist,ar,ppos+1);

        return minpos + leftlist.size();


	}

	static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = in.nextInt();
		}
		in.close();
		quickSort(ar);
	}
}
