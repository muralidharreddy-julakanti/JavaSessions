package javasessions;

public class TimeComplexity {

	public static void main(String[] args) {
		
		// Time Complexity - Big O(n)
		
		int i = 1; // 1 --> O(1)
		int k = 10; // 1 --> O(1)
		
		// constant time : O(1)
		
		System.out.println("****************************************");
		
		for(int m = 1; m<= 10; m++) {
			System.out.println(m);
		}
		
		// for linear equation 3n + 1 --> O(n)
		
		System.out.println("******************************************");
		for ( int p =1; p<=10; p++) {
			for(int q=1; q <=10; q++) {
				System.out.println(p+""+q);
			}
		}
		// for quadratic equations
		// (1+n+n)(1+n+n+n) --> (1+2n)(1+3n) --> 1+3n+2n+6n^2 --> 6n^2+5n+1 --> 6n^2+5n --> n(6n+5)	--> n^2 ==> O(n^2)	
		
		
		for ( int p =1; p<=10; p++) {
			for(int q=1; q <=10; q++) {
				for(int r=1; r<=10; r++) {
				System.out.println(p+""+q+""+r);
				}
			}
		}
		
		// O(n^3)
	}
}
