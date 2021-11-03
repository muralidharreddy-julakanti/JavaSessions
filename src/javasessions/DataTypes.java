package javasessions;

public class DataTypes {

	public static void main(String[] args) {
		//data types:
		
		
		//Java is strict in types
		
		/** Data types are 2 
		 * 1. primitive data types
		 * 		We don't need to create objects to store these values
		 * 		
		 * 		a. Numeric type:
		 * 				char type : char
		 * 					
		 * 				Integral types:
		 * 					Integer        : byte, short, int, long
		 * 					Floating-point : float, double
		 * 
		 * 		b. Boolean type:
		 * 					boolean       : true/false
		 * 
		 * byte: 
		 * 		size : 1 byte - 8 bits
		 * 		range: -128 to 127
		 * 		   ex: byte b = 10;
		 * 
		 * short:
		 * 		size : 2 bytes - 2*8 bits = 16 bits
		 * 		range: -32768 to 32767
		 *         ex: short s = 20000;
		 * 
		 * int:
		 * 		size : 4 bytes - 4*8 bits = 32 bits
		 * 		range: -2^31 to 2^31-1
		 *         ex: int i = 123400;
		 * 
		 * long:
		 * 		size : 8 bytes - 8*8 bits = 64 bits
		 * 		range: -2^63 to 2^63-1
		 *         ex: long l = 9729718818l;
		 *         
		 * float:
		 * 		size : 4 bytes = 32 bits
		 * 		range: after . up to 7 decimal digits
		 * 		ex: float f = 12.33f;
		 *          float f1 = (float)34.56;
		 *          
		 * double:
		 * 		size : 8 bytes = 64 bits
		 *      range: after . up to 16 decimal digits
		 *         ex: double d = 12.3333;
		 *             double d1 = 13.555555555555d;
		 *            
		 * char:
		 * 		size : 2 bytes = 16 bits  ( to support uni-code characters)
		 *      range: ASCII values ranges	
		 *         ex: char c1 = 'a';
		 *             char c2 = '&';
		 *             
		 * boolean:
		 * 		size : ~1 bit
		 *      range: true/false
		 *         ex: boolean flag = true;
		 *             boolean flag1 = false;
		 * 				
		 * 2. non primitive data types
		 * 		class, object, arrays, interface
		 * 				
		*/
		
		byte b = 10;
		     b = 20;
		byte b1 = -10;
		System.out.println(b);
		System.out.println(b1);
		
		short s = 2500;
		short s1 = 10;
		System.out.println(s+s1);
		
		int i = 200;
		int j = 10000;
		System.out.println(j-i);
		
		long phoneNumber = 9729718818l;
		System.out.println(phoneNumber);
		
		float f = 12.33f;
		float f1 = (float)33.33;
		System.out.println(f1+f);
		
		double d1 = 12.55;
		double d2 = 55.22;
		System.out.println(d1+d2);
		
		char c1 = 'a';
		char c2 = '&';
		System.out.println(c1 +" & " +c2);
		
		boolean isActive = true;
		boolean isEnabled = false;
		System.out.println(isActive);
		System.out.println(isEnabled);
				
	}

}
