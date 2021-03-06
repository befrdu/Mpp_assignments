package problem_4;

import java.util.stream.IntStream;

public class Squares {
	public static void main(String[] args) {	
		printSquares(4);
		System.out.println("============");
		wrongPrintSquares(4);
	}
	public static void printSquares(int limit) {
		IntStream squares = IntStream.iterate(1, n -> nextSquare(n)).limit(limit);
		squares.forEach(System.out::println);
		
	}
	
	
	private static int nextSquare(int n) {
		return (int) Math.pow((int)Math.sqrt(n) + 1, 2);
	}
	
	
	//doesn't work 
	public static void wrongPrintSquares(int limit) {
		IntStream squares = IntStream.iterate(2, n -> n * n).limit(limit);
		squares.forEach(System.out::println);
	
	}
}
