package javasessions;

public class SwitchCaseConcept {

	public static void main(String[] args) {
		
		String browser = "firefox";
		
		switch (browser) {
		
		case "chrome":
			System.out.println("Launch Chrome");
			break;
			
		case "firefox":
			System.out.println("Launch Firefox");
			break;
			
		case "safari":
			System.out.println("Launch Safari");
			break;

		default:
			System.out.println("Please paas the right browser " +browser);
			break;
		}
		
		
		//different environments
		String env = "QA";
		
		switch (env.toUpperCase()) {
		case "DEV":
			System.out.println("url : http://www.dev.murali.com");
			System.out.println("dev:dev");
			break;
			
		case "QA":
			System.out.println("url : http://www.qa.murali.com");
			System.out.println("qa:qa");
			break;
			
		case "STAGE":
			System.out.println("url : http://www.stage.murali.com");
			System.out.println("stg:stg");
			break;
			
		case "PROD":
			System.out.println("url : http://www.murali.com");
			System.out.println("admin:123");
			break;

		default:
			System.out.println("Please pass right environment " +env);
			break;
		}
		
	}

}
