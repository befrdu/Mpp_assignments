package problem_5;

import java.util.Arrays;
import java.util.List;




public class ForEachExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", 
				"Away", "On Vacation", "Everywhere you want to be");
		
		//solution to part a
		list.forEach(s -> System.out.println(s.toUpperCase()));	
		list.forEach(System.out::println);	
		list.forEach(s -> printUpper(s));
		list.forEach(s -> ForEachExample.printUpper(s));
		//solution to part b
		list.forEach(ForEachExample::printUpper);
	}
	
	public static void printUpper(String s) {
		System.out.println(s.toUpperCase());
	}
	
	
	
}