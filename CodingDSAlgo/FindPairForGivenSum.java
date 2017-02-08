import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FindPairForGivenSum {

	private static void printPairWithSum(int [] a,int sum) {
		Set<Integer> set = new HashSet<Integer>();
		for(int i=0;i<a.length;i++) {
			if(set.contains(sum-a[i])) {
				System.out.println(sum-a[i]+","+a[i]);
				break;
			}
			set.add(a[i]);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] a = new int[n] ;
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		
		int sum = sc.nextInt();
		printPairWithSum(a,sum);
	}

}
