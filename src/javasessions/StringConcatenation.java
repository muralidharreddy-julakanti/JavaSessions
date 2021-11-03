package javasessions;

public class StringConcatenation {

	public static void main(String[] args) {
			
		int a = 10;
		int b = 20;
		
		double d1 = 12.33;
		double d2 = 23.45;
		
		System.out.println(a+b);
		System.out.println(a-b);
		
		String s = "testing";
		String s1 = "Selenium";
		
		System.out.println(s+s1);
		
		String x = "Hello";
		String y = "Murali";
		
		System.out.println(a+x);
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		
		System.out.println("the value of a is : " + a);
		System.out.println("the value of b is : " + b);
		System.out.println("the sum is : " + (a+b));
		
		System.out.println(a+b+d1+d2+x+y);
		System.out.println(x+y+a+b+d1+d2);
		
		char c1 = 'a';
		char c2 = 'b';
		
		System.out.println(c1);
		System.out.println(c1+c2);
		
		//a-z --> 97 to 122
		//A-Z --> 65 to 90
		//0-9 --> 48 to 57
		
		System.out.println((int)c1);
		
		byte b1 = 120;
		byte b2 = 123;
		int b3 = b1+b2;
		System.out.println(b3);
		System.out.println(b1+b2);
		
		System.out.println(10/2);
		System.out.println(10/3);
		System.out.println(10.0/3);
		System.out.println(10/3.0);
		System.out.println(10.0/3.0);
		
		System.out.println(0/1);
	//	System.out.println(9/0);
	//	System.out.println(0/0);
		System.out.println(0.0/0);    //NaN  --> not a number
		System.out.println(0.0/0.0);  //NaN
		System.out.println(0/0.0);    //NaN
		System.out.println(9.0/0);    //Infinity
		System.out.println(9.0/0.0);  //Infinity
		
		
		System.out.println(9 % 2);
		System.out.println(9 % 3);
		
		
	}

}
