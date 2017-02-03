package io.javabrains;

public class TypeInterfaceExample {

	public static void main(String[] args) {
		
		StringLengthLambda lengthOfStr = (String s) -> s.length();
		System.out.println("lengthOfStr  " + lengthOfStr.getLenght("Test"));
		
		StringLengthLambda lengthOfStr2 = ( s ) -> s.length();  // need not to keep the iput data type as well, from the reference it understands
		System.out.println("lengthOfStr2  " + lengthOfStr2.getLenght("Test2"));
		
		StringLengthLambda lengthOfStr3 = s  -> s.length();// if ur interface has only one argument then need not to keep the braces ()
		System.out.println("lengthOfStr3  " + lengthOfStr3.getLenght("Test Three"));

	}

	interface StringLengthLambda{
		int getLenght(String s);
	}
}
