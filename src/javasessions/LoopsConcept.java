package javasessions;

public class LoopsConcept {
	
	public static void main(String[] args) {
		// while loop
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
		
		int k =1;
		while (k <=20) {
			System.out.println(k);
			if(k % 5 == 0) {
				System.out.println("Hi Murali");
			}
			k++;
		}
		
		
		// use cases for while loop in selenium
		// 1. when the number of iterations are not fixed  --prefer while loop
		// 2. Amazon -- total products -- 1 to 100, 1to 200, 1 to 300
		// 3. checking the element present on the pages -- while loop
		// 4. pagination
		
		
		// for loop:
		System.out.println("*******************************************************************");
		
		for (int j = 1; j <= 10; j++) {
			System.out.println(j);
		}
		
		//valid
		int z=0;
		for (;z<5;) {
			System.out.println(z);
			z++;
		}
		
		/*
		 * // Infinity 
		 * for(;;) 
		 * { 
		 *	 System.out.println("bye"); 
		 * }
		 */
		for(char c ='a'; c<='z'; c++) {
			System.out.println(c + " ");
		}
		
		for(int c ='a'; c<='z'; c++) {
			System.out.println(c);
		}
		
		for(double d = 1.1; d<= 10.0; d++) {
			System.out.println(d);
		}
		
		// use cases for for loop
		// 1. when we are sure about the total number of iterations
		// 2. iterating arrays, arraylist -- for loop
		// 3. data driven - get the data from Excel  -- total rows = 10;
		
		System.out.println("**********************do while***********************************");
		
		int r = 1;
		do {
			System.out.println(r);
			r++;
		} while (r <= 10);
		
		// use cases for do while loop in selenium
		// 1. pagination
		// 2. check the title of the page
		
		
		// loop with break
		for (int h = 1; h <= 10; h++) {
			System.out.println(h);
			if(h % 5 == 0) {
				System.out.println("Hi");
				break;
			}
		}
		
		/**
		 * Example 1:  for loop with break in selenium
		 * 
		 * get the list of all the footer links
		 * start a loop
		 * put a condition to check the link text is equal to amazon
		 * click on that element
		 * break the loop
		 * 
		 * Example 2: drop down list
		 * 
		 */
		
	}

}
