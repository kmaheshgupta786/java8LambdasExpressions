package io.javabrains;

public class Greeter {

	public void greet(Greeting greeting){
		greeting.perform();
	}
	
	public static void main(String args[]){
		
		//java7 - way of implementation
		Greeter greeter = new Greeter();
		HellowWorldGreeting hellowWorldGreeting = new HellowWorldGreeting();
		greeter.greet(hellowWorldGreeting);
		
		//java8 - way of lambda implementation
		myLambda myLambdaExpression = () -> System.out.println("Hellow World by Lambda Expression");	
		Greeting myLambdaExpression2 = () -> System.out.println("Hellow World by Lambda Expression");
		
		myLambdaExpression.test();
		myLambdaExpression2.perform();
		
		/*
		 * 1. based on right side lambda expression, we should have return type as interface reference variable
		 * 2. At the same time we should not declare multiple methods in the interface, if we are using these 
		 *    interfaces as return type of lambda expressions.
		 *    
		 *    eg: Assume myLambda interface has two methods like
		 *    public void test1();
		 *    public void test2(int a, int b);
		 *    
		 *    and if u run the code like below
		 *    myLambda myLambdaExpression = () -> System.out.println("Hellow World by Lambda Expression");
		 *    it will give compilation error becoz, compilor confuse which mehtod your are going to implement
		 *    even though you has different method signatures.
		 *    
		 *    code snippet:
		 *    public interface myLambda{
					public void test();
					public int add(int a, int b);
				}
	
			  calling time:
			  myLambda myLambdaExpression = () -> System.out.println("Hellow World by Lambda Expression");	
			  right side compiler error :
			  - The target type of this expression must be a functional interface (means it should have only one method declaration in interface).
	
		 */
		
		
		
		// Ananymous interface implementaion
		Greeting myLambdaExpression3 = () -> System.out.println("Hellow World by Lambda Expression3");
		Greeting anonymousInterface = new Greeting(){
			public void perform(){
				System.out.println("Hellow World :: Anonymous Interface Implementation. ");
			}
		};
		
		myLambdaExpression3.perform();
		anonymousInterface.perform();
	}
	
	public interface myLambda{
		public void test();
	}
}
