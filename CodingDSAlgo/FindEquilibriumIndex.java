/**
 *  Find equilibrium index in an array (sum(0..i-1) = sum(i+1..n-1))
 *  Problem credits: http://www.techiedelight.com/find-equilibrium-index-array/
 */

import java.util.Scanner ;

public class FindEquilibriumIndex {

	private static int getEquilibriumIndex(int [] a) {
		int totalSum = 0;	//totalSum
		for(int ai:a) { 
			totalSum+=ai ;
		}
		int leftSum=0;	//keep Track of left sum
		int i=0;
		for(int ai:a) {
			int rightSum = totalSum -ai-leftSum;	//total = left + right + current
			if(leftSum == rightSum) 
				return i;
			leftSum +=ai;
			i++;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("equilibruim index is : "+getEquilibriumIndex(a));

	}

}
