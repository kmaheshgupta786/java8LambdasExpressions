package src.io.javabrains.unit2;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		int[] someNumbers = {1,2,3,4,5};
		int key = 0;
		
		process(someNumbers, key, (v, k)  -> {
			try{
				System.out.println(v/k);
			}catch(ArithmeticException e){
				System.out.println("ArithmeticException happened");
			}
		});
 
	}

	private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> biConsumer) {
		for(int i : someNumbers){
			biConsumer.accept(i, key);
		}
		
	}

	
}
