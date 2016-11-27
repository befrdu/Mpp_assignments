package problem_3;

public interface CannotQuack extends Quackable {
	default void quack() {
		System.out.println("  cannot quack");
	}
}
