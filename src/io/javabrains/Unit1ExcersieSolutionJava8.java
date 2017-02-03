package src.io.javabrains;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Unit1ExcersieSolutionJava8 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51),
				new Person("Charlotte", "Bronte", 45),
				new Person("Mathew", "Arnold", 39)
				);

	

	//setp 1 : sort list by last name
	Collections.sort(people, (p1,p2) -> p1.getLastName().compareTo(p2.getLastName()));		
			
	
	//step 2 : create a method that prints all elements in the list
	System.out.println("Printing all list : ");
	printConditionally(people, p -> true);	
	
	
	//step 3.1 
	System.out.println("Way 2 : printing people : last name starts with C :");
	printConditionally(people, p -> p.getLastName().startsWith("C"));	

	}

	private static void printConditionally(List<Person> people, Condition condition) {
		for(Person p : people){
			if(condition.test(p)){
				System.out.println(p);
			}			
		}
		
	}

	
}


