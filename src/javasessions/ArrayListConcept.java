package javasessions;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		/**
		 * ArrayList - default class dynamic array size is not fixed
		 */

		// create the object of the ArrayList class
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(200);
		al.add(300);

		System.out.println(al.size());

		al.add(400);
		al.add(500);
		System.out.println(al.size());

		al.remove(3);
		System.out.println(al.get(3));
		System.out.println(al.size());

		al.add("testing");
		al.add(12.33);
		al.add(true);
		al.add('M');

		// to print all the values from the arraylist
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		System.out.println("*******************************************");
		for(Object a : al) {
			System.out.println(a);
		}
		
		System.out.println("*******************************************");
		ArrayList<String> studentNames = new ArrayList<String>();
		studentNames.add("Murali");
		studentNames.add("Reddy");
		studentNames.add("Julakanti");
		
		for(String name: studentNames) {
			System.out.println(name);
		}
		
		System.out.println("*******************************************");
		for(int i = 0; i<studentNames.size(); i++) {
			System.out.println(studentNames.get(i));
			
			if(studentNames.get(i).equals("Murali")) {
				System.out.println("Student name is Murali");
				break;
			}
		}
		
		/**
		 * use cases in selenium
		 * 
		 * Example 1:
		 * 		10 links on the page
		 * 		collect all 10 links in a array list
		 * 		start a loop:
		 * 				if(ele.text().equals('amazon')
		 * 					click()
		 * 					break;
		 * 
		 * 
		 * Example 2: 
		 * 		drop down selection:
		 * 			20 elements/options are there
		 * 			collect all 20 values in arraylist
		 * 			start a loop:
		 * 				if(ele.text().equals('India')
		 * 					select the value
		 * 					break
		 * 
		 */

	}

}
