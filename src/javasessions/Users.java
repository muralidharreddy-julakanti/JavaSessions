package javasessions;

public class Users {
	String name;
	int age;
	String city;

	public static void main(String[] args) {
		
		Users u1 = new Users();
		u1.name ="Murali";
		u1.age = 35;
		u1.city = "Hyderabad";
		
		Users u2 = new Users();
		u2.name ="Reddy";
		u2.age = 42;
		u2.city = "Bangalore";
		
		Users u3 = new Users();
		u3.name ="Julakanti";
		u3.age = 43;
		u3.city = "Pune";
		
		System.out.println(u1.name + " " + u1.age + " " + u1.city);
		System.out.println(u2.name + " " + u2.age + " " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " + u3.city);
		
		u1 = u2;
		System.out.println(u1.name + " " + u1.age + " " + u1.city);
		System.out.println(u2.name + " " + u2.age + " " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " + u3.city);
		
		u2 = u3;
		System.out.println(u1.name + " " + u1.age + " " + u1.city);
		System.out.println(u2.name + " " + u2.age + " " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " + u3.city);
		
		u3 = u1;
		System.out.println(u1.name + " " + u1.age + " " + u1.city);
		System.out.println(u2.name + " " + u2.age + " " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " + u3.city);
		
	}

}
