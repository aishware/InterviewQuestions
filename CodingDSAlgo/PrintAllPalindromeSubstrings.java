/*print all palindromes in a string 
*
*Space complexity: O(n^2), Time Complexity: O(n^2)
*/

import java.util.Scanner ;

public class PrintAllPalindromeSubstrings {
	
	private static void printAllPalindromeSubstring(String word) {
		int len = word.length();
		boolean [][] isPalin = new boolean [len][len] ;
		for(int i=0;i<len;i++) {
			isPalin[i][i]  = true ;
			//print this subString
			System.out.println(word.substring(i,i+1));
		}
		
		for(int l = 2;l<=len;l++) {
			for(int start =0;start+l<=len ; start++) {
				int end = start+l-1;  //start = 0 , len= 2, end = 1,
				//if len=2 start+1,end-1 will form zero length array which will be a palindrome
				if((l==2 || isPalin[start+1][end-1]) && word.charAt(start) == word.charAt(end)) {
					isPalin[start][end] = true ;
					//print this substring
					System.out.println(word.substring(start,end+1));
				}
			}
		}
	}
	
	private static void takeInputAndProcess(Scanner sc) {
		
		String word = sc.next();
		printAllPalindromeSubstring(word);
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