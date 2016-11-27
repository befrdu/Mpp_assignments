package problem_1j;
import java.util.function.Supplier;
public class Lambda {

	public static void main(String[] args) {
		Supplier<Double> rand1 = () -> Math.random();
		System.out.println(rand1.get());

	}

}
