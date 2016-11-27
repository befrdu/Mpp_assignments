package problem_3;

public class DecoyDuck extends Duck implements Cannotfly, CannotQuack {
	
	@Override
	public void display() {
		System.out.println("  displaying");
		
	}
}
