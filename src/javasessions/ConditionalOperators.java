package javasessions;

public class ConditionalOperators {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		System.out.println(a==b);  // false
		System.out.println(a<b);   // true
		
		if(a==b) {
			System.out.println("both are equal");
		}
		else {
			System.out.println("both are not equal");
		}
		
		
		if(true) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");        //this is dead code never comes to this else part
		}
		
		
		boolean flag = true;                   // this is not a dead code
		if(flag) {
			System.out.println("Murali");
		}
		else {
			System.out.println("Julakanti");
		}
		
		int total = 200;
		if(total <=100) {
			System.out.println("total is less than or equal to 100");
			 if(total >=80) {
				 System.out.println("total is greater than or equal to 80 ");
				 	if(total ==80) {
				 		System.out.println("Grade A");
				 	}
				 	else {
				 		System.out.println("FAIL");
				 	}
			 } 
			 else {
				 System.out.println("NA");
			 }
		}
		else {
			System.out.println("Bye");
		}
		
		
		String browser ="chrome";
		if (browser.equals("chrome")) {
			System.out.println("Chrome launch");
		}
		else if (browser.equals("firefox")) {
			System.out.println("Firefox launch");
		}
		else if (browser.equals("safari")) {
			System.out.println("Safari launch");
		}
		else {
			System.out.println("please pass the right browser name");
		}
		
		
		
		
		
	}

}
