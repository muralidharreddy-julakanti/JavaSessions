package javasessions;

public class EComm {
	
	// method overloading
	// with in the same class when we have different methods
	// 1. with the same name
	// 2. with different types parameters
	// 3. the order of the parameters are different
	// 4. no.of parameters are different

	public static void main(String[] args) {
		EComm e = new EComm();
		e.login();
		e.login("Murali", "Reddy");
		
	}
	
	public void login() {
		System.out.println("login method");
	}
	
	public void login(String userName, String password) {
		System.out.println("login method with "+userName+ " and "+password);
	}

}
