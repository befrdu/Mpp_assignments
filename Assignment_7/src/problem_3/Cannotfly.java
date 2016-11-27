package problem_3;

public interface Cannotfly extends Flyable {
	default void fly() {
		System.out.println("  cannot fly");
	}
}
