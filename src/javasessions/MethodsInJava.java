package javasessions;

public class MethodsInJava {
	
	// methods/functions : logic is written in a block
	// you can call this block
	// static & static methods
	
	// can not create a method inside a method
	// but can call the methods from different methods
	// duplicate methods are not allowed
	// but we can overload the methods
	// methods should be parallel to each other 
	// independent to each other
	// to call the non static method  -- we have to create the object of the class
	// can return only one value at a time
	

	public static void main(String[] args) {
		MethodsInJava obj = new MethodsInJava();
		obj.test();
		int d = obj.sum();
		System.out.println(d);
		String s = obj.getTrainerName();
		System.out.println(s + "@Murali.com");
		
		String s1 = obj.getTrainerName();
		if(s1.equals("Murali")) {
			System.out.println("PASS");
		}
		
		int s2= obj.add(15,25);
		System.out.println(s2);
		
	}
	
	

	// 1. no input and no return
	// void --> does not return anything (no return keyword)
	
	public void test() {
		System.out.println("test method");
	}
	
	// 2. no input but return some
	// return type int
	public int sum() {
		System.out.println("sum method");
		int a = 10;
		int b = 20;
		int c = a + b;
		return c;
	}
	
	private String getTrainerName() {
		System.out.println("get trainer name");
		String name = "Murali";
		return name;
	}
	
	
	// 3. some input and some return
	public int add(int a, int b) {
		System.out.println("add method");
		int sum = a+b;
		return sum;
	}

}
