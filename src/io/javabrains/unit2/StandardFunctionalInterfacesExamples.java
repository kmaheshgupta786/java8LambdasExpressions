package src.io.javabrains.unit2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import src.io.javabrains.Person;

public class StandardFunctionalInterfacesExamples {

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
	performConditionally(people, p -> true, p -> System.out.println(p));	
	
	
	//step 3
	System.out.println("Way 2 : printing people : last name starts with C :");
	performConditionally(people, p -> p.getLastName().startsWith("C"), p -> System.out.println(p));	

	}

	private static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
		for(Person p : people){
			if(predicate.test(p)){
				consumer.accept(p);
			}			
		}
		
	}

	


}
