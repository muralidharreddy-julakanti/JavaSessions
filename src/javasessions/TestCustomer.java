package javasessions;

public class TestCustomer {

	public static void main(String[] args) {
		
		Customer c = new Customer();
		c.name = "Murali";
		c.emailId = "murali@gmail.com";
		c.phone = 99999999;
		c.isPrime = true;
		
		System.out.println(c.name);
		System.out.println(Customer.category);
		
		
	}

}
