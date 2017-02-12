/*
Move all zero to array end. Relative order of element should be maintained
*/

import java.util.Scanner ;

public class MoveZerosToEnd {
	
	//Modified partition logic taken from quick sort
	private static void moveZerosToEnd(int [] a) {
		//use the partition logic to partition zero and non-zero elements
		int pivot = 0 ;
		int nextNonZeroIndex = 0;
		//there will be only 0s b/w nextNonZeroIndex and i-1
		for(int i=0;i<a.length;i++) {
			if(a[i] != pivot) {
				//swap this element to next non-zero index
				int tmp = a[nextNonZeroIndex] ;
				a[nextNonZeroIndex] = a[i] ;
				a[i] = tmp ;
				nextNonZeroIndex ++ ;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		int n = sc.nextInt();
		int [] a = new int[n] ;
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		moveZerosToEnd(a);
		for(int ai:a) System.out.print(ai+" ");
		System.out.println("");
	}
}