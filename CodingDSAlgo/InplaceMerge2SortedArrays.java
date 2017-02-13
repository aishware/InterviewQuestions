
/*
*Given two sorted arrays X[] and Y[] of size m and n each, merge elements of X[] with elements of array Y[] by maintaining the sorted order. i.e. fill X[] with first m smallest elements and fill Y[] with *remaining elements.
Time: O(mlogm+nlogn) Space: O(1)
Note: for O(n) time and O(1) space solution : http://www.akira.ruc.dk/~keld/teaching/algoritmedesign_f04/Artikler/04/Huang88.pdf
*/

import java.util.Scanner;
import java.util.Arrays;

public class InplaceMerge2SortedArrays {

	private static void swap(int[] x, int[] y, int i, int j) {
		int tmp = x[i];
		x[i] = y[j];
		y[j] = tmp;
	}

	private static void inplaceMerge(int[] x, int[] y) {
		int m = x.length;
		int n = y.length;
		// count first m small elements 
		int count = 0;
		int p1 = 0, p2 = 0;
		while (count < m) {
			if (p2 < n && x[p1] > y[p2]) {	//no overflow check for p1 as len(x) = m and count will be < m and p1+p2 < m in loop
				p2++;
			}
			else {
				p1++;
			}
			count++;
		}
		// Now swap first p2 elements from y with last p2 elements in x
		for (int i = 0; i < p2; i++) {
			swap(x, y, p1 + i, i);
		}
		// Now sort both the arrays
		Arrays.sort(x);
		Arrays.sort(y);
	}
	
	private static void arrayInput(int [] x,int n,Scanner sc) {
		for(int i=0;i<n;i++) {
			x[i] = sc.nextInt();
		}
	}
	
	private static void takeInputAndProcess(Scanner sc) {
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[] x = new int[m];
		int[] y = new int[n];
		arrayInput(x,m,sc) ;
		arrayInput(y,n,sc) ;
		inplaceMerge(x, y);
		System.out.print("array 1: ");
		for (int a : x)
			System.out.print(a + " ");
		System.out.println("");
		System.out.print("array 2: ");
		for (int a : y)
			System.out.print(a + " ");
		System.out.println("");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt() ;
		while(t-- >0 ) {
			takeInputAndProcess(sc);
		}
		sc.close();
		
	}
}