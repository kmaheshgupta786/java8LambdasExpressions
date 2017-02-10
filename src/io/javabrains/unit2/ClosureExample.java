package src.io.javabrains.unit2;

public class ClosureExample {

	public static void main(String args[]){
		int a = 10;
		int b = 20;
		doProcess(a, new Process(){

			@Override
			public void process(int i) {
				System.out.println("Closure : "+ (i+b));				
			}			
		});		
	}
	
	public static void doProcess(int i, Process p){
		p.process(i);
	}
}

interface Process{
	void process(int i);
}