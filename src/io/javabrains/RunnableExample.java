package src.io.javabrains;

public class RunnableExample {

	public static void main(String[] args) {
		
		// java 7 
		Thread myThread = new Thread(new Runnable(){

			@Override
			public void run() {
				System.out.println("Printed inside Runnable Ananymous inner class");
				
			}
			
		});
		
		myThread.run();
		
		
		// java 8
		Thread myLambdaThread = new Thread(() -> System.out.println("Printed using Lamdbda Expression"));
		myLambdaThread.run();
		
	}

}
