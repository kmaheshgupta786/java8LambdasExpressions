package src.io.javabrains;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExcersieSolutionJava7 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51),
				new Person("Charlotte", "Bronte", 45),
				new Person("Mathew", "Arnold", 39)
				);

	

	//setp 1 : sort list by last name
	Collections.sort(people, new Comparator<Person>(){

		@Override
		public int compare(Person o1, Person o2) {
			return o1.getLastName().compareTo(o2.getLastName());
		}
	});
	
	//step 2 : create a method that prints all elements in the list
	System.out.println("Printing all list : ");
	printAll(people);
	
	//step 3 : create a method that prints all people that have last name begins with C
	System.out.println("Way 1 : printing people : last name starts with C :");
	printLastNameBeginningWithC(people);
	
	//step 3.1 
	System.out.println("Way 2 : printing people : last name starts with C :");
	printConditionally(people, new Condition(){

		@Override
		public boolean test(Person p) {
			return p.getLastName().startsWith("C");
		}
		
	});

	}

	private static void printConditionally(List<Person> people, Condition condition) {
		for(Person p : people){
			if(condition.test(p)){
				System.out.println(p);
			}			
		}
		
	}

	private static void printLastNameBeginningWithC(List<Person> people) {
		for(Person p : people){
			if(p.getLastName().startsWith("C")){
				System.out.println(p);
			}			
		}
		
	}

	private static void printAll(List<Person> people) {
		for(Person p : people){
			System.out.println(p);
		}
		
	}

}

interface Condition{
	boolean test(Person p);
}
