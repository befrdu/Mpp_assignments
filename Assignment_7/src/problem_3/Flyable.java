package problem_3;

public interface Flyable {
	default void fly() {
		System.out.println("  flying");
	}
}
