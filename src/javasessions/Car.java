package javasessions;

public class Car {
	
	String name;
	int price;
	String color;
	static int wheels = 4;  //common property value
	

	public static void main(String[] args) {
		
		//Object will never hold any static property
		//static variables should be access by class name
		Car c1 = new Car();
		c1.name = "BMW";
		c1.color = "Red";
		c1.price = 10000;
		
		Car c2 = new Car();
		c2.name = "Honda";
		c2.color = "Black";
		c2.price = 1000;
		
		Car c3 = new Car();
		c3.name = "Audi";
		c3.color = "Silver";
		c3.price = 15000;
		
		System.out.println(c1.name + " " + c1.color + " " + c1.price + " " + Car.wheels);
		System.out.println(c1.wheels); // wrong practice
		
		// static variables can be access directly without class name
		System.out.println(wheels);
		
	}

}
