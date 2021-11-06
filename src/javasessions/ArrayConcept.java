package javasessions;

public class ArrayConcept {

	public static void main(String[] args) {
		
		//Array:
		// 1. static array : size is fixed
		// 2. dynamic array : size is dynamic
		
		
		int i[] = new int[5];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		i[4] = 50;
		
		System.out.println("size of the arry : "+i.length);
		System.out.println(i[3]);
	//	System.out.println(i[5]); //ArrayIndexOutOfBoundsException  - Run time
	//	System.out.println(i[-1]); //ArrayIndexOutOfBoundsException  - Run time
		
		// to print all the values from the array
		for(int k = 0; k<i.length; k++) {
			System.out.println(i[k]);
		}
		
		System.out.println("*******************************************");
		
		// for each loop - enhanced for loop
		for (int e : i) {
			System.out.println(e);
		}
		System.out.println("*******************************************");
		
		
		//Emp Data: name(String), age(int), gender(char), salary(double), isPerm(boolean)
		//object static array:
		//object : is a parent class of all the the classes in java
		Object empData[] = new Object[5];
		empData[0] = "Murali";
		empData[1] = 30;
		empData[2] = "M";
		empData[3] = 64.22;
		empData[4] = true;
		
		for(Object o : empData) {
			System.out.println(o);
		}
		
		System.out.println("*******************************************");
		int count = 0;
		for(Object o : empData) {
			System.out.println(count + "=" +o);
			count++;
		}
		
		
		
		
	}

}
