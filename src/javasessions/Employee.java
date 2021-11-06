package javasessions;

public class Employee {
	
	// class --> blue print of all objects
	// class is a concept
	// class template --> create the object
	
	//class variables: will be common for all the objects
		String name;
		int age;
		double salary;
		boolean isActive;

	public static void main(String[] args) {
		
		//local variables no where related to objects
		
		//create the object: use new keyword
		Employee emp = new Employee();
		
		emp.name = "Murali";
		emp.age = 35;
		emp.salary = 300000.00;
		emp.isActive = true;
		
		System.out.println(emp.name);
		System.out.println(emp.age);
		System.out.println(emp.salary);
		System.out.println(emp.isActive);
		
		Employee e2 = new Employee();
		e2.name = "Anvi";
		e2.age = 8;
		
		System.out.println("Name : " +e2.name + " Age " + e2.age + " Salary " + e2.salary + " Active " + e2.isActive);
		
		 new Employee().name = "Reddy";
		 new Employee().age = 21;
		 
		 Employee e5 = new Employee();	
		 e5 = null;  //null ref object
		 System.out.println(e5.name);  //NPE
		 System.gc(); //will try to destroy 3 objects
		 
		
	}

}
