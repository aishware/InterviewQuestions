import java.util.Scanner;

public class ThreeWayPartition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] a = new int[n];
		for(int i=0 ;i<n;i++) {
			a[i] = sc.nextInt();
		}
		
		sc.close();
		threeWayPartition(a);
		
		for(int _a:a) System.out.print(_a+" ");
		
		System.out.println("");

	}
	
	private static void swap(int [] a,int i,int j) {
		int tmp = a[i] ;
		a[i] = a[j] ;
		a[j] = tmp ;
	}

	private static void threeWayPartition(int[] a) {
		int zero = 0;
		int one = 0 ;
		int two = a.length-1;
		while(one<=two) {
			if(a[one]<1) {
				swap(a,one,zero);
				zero++;
				one++;
			}
			else if(a[one]>1) {
				swap(a,one,two);
				two--;
			}
			else {
				one++;
			}
		}
	}

}
