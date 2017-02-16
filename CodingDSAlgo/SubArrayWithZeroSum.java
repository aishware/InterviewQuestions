/*
Find subarrays with sum = zero.
1, 0 , -1  2 3 , 4 ,-7 fix this case
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SubArrayWithZeroSum {
	
	private static void printAllSubarraysWithZeroSum(int [] a) {
		Map<Integer,ArrayList<Integer>> prevSum = new HashMap<Integer,ArrayList<Integer>>();
		int sumSoFar = 0;
		ArrayList<Integer> zeroSums = new ArrayList<>() ;
		zeroSums.add(-1);
		prevSum.put(0, zeroSums);
		for(int i=0;i<a.length;i++) {
			sumSoFar+= a[i] ;
			//check if this sum has been appeared ;
			ArrayList<Integer> prevSumIdx = (ArrayList<Integer>)prevSum.get(sumSoFar);
			if(prevSumIdx != null) {
				for(int j: prevSumIdx) {
					j++;
					if(j!= i) {
						System.out.println(j+","+i);
					}
					else {
						System.out.println(j);
					}
				}
			}
			else {
				prevSumIdx = new ArrayList<Integer>();
			}
			prevSumIdx.add(i);
			prevSum.put(sumSoFar,prevSumIdx);
		}
	}
	
	private static void takeInputAndProcess(Scanner sc) {
		int n = sc.nextInt();
		int [] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		printAllSubarraysWithZeroSum(a);
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