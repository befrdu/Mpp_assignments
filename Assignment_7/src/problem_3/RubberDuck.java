package problem_3;

public class RubberDuck extends Duck implements Squeak, Cannotfly {
	
	@Override
	public void display() {
		System.out.println("  displaying");
		
	}
}
