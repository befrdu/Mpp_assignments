package problem_1j;

import java.util.function.Supplier;

public class Inner {
	public static void main(String[] args) {
		Inner inner = new Inner();
		Supplier<Double> supplier = inner.new MySupplier();
		System.out.println(supplier.get());
	}
	
	class MySupplier implements Supplier<Double> {

		@Override
		public Double get() {
			return Math.random();
		}
		
	}
}
