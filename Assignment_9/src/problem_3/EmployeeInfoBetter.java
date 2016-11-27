package problem_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.function.*;

public class EmployeeInfoBetter {
	static enum SortMethod {BYNAME, BYSALARY};
	Function<Employee, String> byName = e -> e.getName();
	Function<Employee, Integer> bySalary = e -> e.getSalary();
	
	HashMap<SortMethod, Comparator<Employee>> map = new HashMap<SortMethod, Comparator<Employee>>(){
		{
			put(SortMethod.BYNAME, Comparator.comparing(byName).thenComparing(bySalary));
			put(SortMethod.BYSALARY, Comparator.comparing(bySalary).thenComparing(byName));
		}
	};
	
	public void sort(List<Employee> emps, final SortMethod method) {
		Collections.sort(emps, map.get(method));		
	}

	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee("Joe", 100000));
		emps.add(new Employee("Tim", 50000));
		emps.add(new Employee("Rick", 50000));
		emps.add(new Employee("Andy", 60000));
		emps.add(new Employee("Tim", 10000));
		EmployeeInfoBetter ei = new EmployeeInfoBetter();
		ei.sort(emps, EmployeeInfoBetter.SortMethod.BYNAME);
		System.out.println("Sort By Name");
		System.out.println(emps);
		//same instance
		System.out.println("Sort By Salary");
		ei.sort(emps, EmployeeInfoBetter.SortMethod.BYSALARY);
		System.out.println(emps);
	}
}
