/*
Find majority element in an array

*/

import java.util.Scanner ;

public class MajorityElement {
	
	private static int getMajorityElement(int [] a) {
		int count =0;
		int me =-1 ;
		for(int ai:a) {
			if(count == 0) {
				me = ai;
				count=1;
			}
			else if(me!=ai) {
				count--;
			}
			else if(me == ai) {
				count++;
			}
		}
		if(count>0) {
			//majority element may exist
			int c =0 ;
			for(int ai:a) {
				c = (ai==me)?c+1:c ;
			}
			if(c > (a.length/2)) {
				return me ;
			}
		}
		return -1;
	}
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] a = new int[n] ;
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		int me = getMajorityElement(a);
		if(me == -1) {
			System.out.println("No Majority element") ;
		}
		else {
			System.out.println("Majority Element is : "+me) ;
		}
	}
	
}
