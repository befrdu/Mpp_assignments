package problem_2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Test {

	public static double sum(Collection<? extends Number> nums){
		double s = 0.0;
		for (Number num: nums) s += num.doubleValue();
		return s;
	}
	
	public static void main(String[] args) {
		test1();
		test2();
	}

	private static void test1() {
		List<Integer> ints = new ArrayList<Integer>();
		ints.add(1);
		ints.add(2);
		List<? extends Number> nums = ints;
		double dbl = sum(nums);
//		nums.add(3.14); //compiler error
		nums.add(null);
	}

	private static void test2() {
		List<Object> objs = new ArrayList<Object>();
		objs.add(1);
		objs.add("two");
		List<? super Integer> ints = objs;
		ints.add(4);
//		double dbl = sum(ints); //compiler error
	}
}
