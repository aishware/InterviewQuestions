/*
 *
 * http://www.techiedelight.com/sort-binary-array-linear-time/
 * 
 * space: O(1) 	time: O(n)
 * 
 * */

import java.util.Scanner ;
public class SortBinaryArray {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		int n = sc.nextInt();
		int [] a = new int[n] ;
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		
		sortBinaryArrayInLinearTime(a);
		
		for(int _a:a) System.out.print(_a+" ");
		System.out.println("");
		
		sc.close();
	}

	private static void sortBinaryArrayInLinearTime(int[] a) {
		int start = 0;	//current number. before this point every number is 0
		int end = a.length-1 ;	//beyond this point every number is 1
		while(start<end) {
			//if a[start] is 0 do nothing and move on as loop invariant is maintained
			if(a[start]==0) {
				start++;
			}
			else {
				//swap with a[end]
				int tmp = a[end] ;
				a[end] = a[start];
				a[start] = tmp;
				//now a[end] has 1 so move to end pointer to left
				end --;	
			}
		}
	}

}
