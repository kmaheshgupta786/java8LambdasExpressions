package src.io.javabrains.unit2;

import java.util.function.BiConsumer;

public class ExceptionHandlingWithWrapperClass {

	public static void main(String[] args) {
		int[] someNumbers = {1,2,3,4,5};
		int key = 0;
		
		/*process(someNumbers, key, (v, k)  -> {
			try{
				System.out.println(v/k);
			}catch(ArithmeticException e){
				System.out.println("ArithmeticException happened");
			}
		});*/
 
		process(someNumbers, key, wraperLambda((v, k)  -> System.out.println(v/k)));
	}

	private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> biConsumer) {
		for(int i : someNumbers){
			biConsumer.accept(i, key);
		}
		
	}

	public static BiConsumer<Integer, Integer> wraperLambda(BiConsumer<Integer, Integer> consumer){
		return (v, k) ->{
			try{
				consumer.accept(v, k);
			}catch(ArithmeticException e){
				System.out.println("Exception caught in wrapper lambda...");
			}
		};
		
	}
	
}
