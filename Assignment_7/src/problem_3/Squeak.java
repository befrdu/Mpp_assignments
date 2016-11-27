package problem_3;;

public interface Squeak extends Quackable {
	default void quack() {
		System.out.println("   squeaking");
	}
}
