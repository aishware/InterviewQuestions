package ds_algo ;
/*
 * http://www.techiedelight.com/rearrange-the-array-with-alternate-high-and-low-elements/
 * 
 * */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class HighLow {	
	
	public static void main(String[] args) {
		InputReader ir = new InputReader(System.in) ;
		int t = 1;
		t = ir.nextInt() ;
		while(t-->0) {
			solve(ir) ;
		}
	}
	
	
	private static void solve(InputReader ir) {
		int n = ir.nextInt() ;
		int [] a = new int [n] ;
		for(int i=0;i<n;i++) {
			a[i] = ir.nextInt() ;
		}
		boolean expectedUp = true ; //a[0]<a[1]
		for(int i=0;i<n-1;i++) {
			boolean foundUp = a[i] < a[i+1] ;
			if(expectedUp != foundUp) {
				//swap a[i] a[i+1]
				int tmp = a[i] ;
				a[i]=a[i+1] ;
				a[i+1] = tmp;
			}
			expectedUp = !expectedUp ;
		}
		for(int ai:a) System.out.print(ai+" ") ;
		System.out.println("");
	}
	
	
static class InputReader {
	private BufferedReader reader ;
	private StringTokenizer tokenizer;

	public InputReader(InputStream stream) {
		reader = new BufferedReader(new InputStreamReader(stream));
		tokenizer = null;
	}

	public String next() {
		while(tokenizer==null || !tokenizer.hasMoreTokens()) {
			try {
				tokenizer = new StringTokenizer(reader.readLine());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken();
	}

	public int nextInt() {
		return Integer.parseInt(next());
	}

	public long nextLong() {
		return Long.parseLong(next());
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}

	public float nextFloat() {
		return Float.parseFloat(next());
	}

	public String nextLine() {
		try {
			return reader.readLine();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}

}