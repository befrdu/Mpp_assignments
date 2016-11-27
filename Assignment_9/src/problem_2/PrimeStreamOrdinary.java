package problem_2;

import java.util.function.Function;
import java.util.stream.IntStream;

public class PrimeStreamOrdinary {

	Function<Integer, IntStream> primesLimit = x -> IntStream.iterate(2,
			n -> PrimesOrdinary.nextPrime(n)).limit(x);
	final IntStream primes = IntStream.iterate(2,
			n -> PrimesOrdinary.nextPrime(n));

	public void printFirstNPrimes(int num) {
		//IllegalStateException: stream has already been operated upon or closed
		//primes.limit(num).forEach(System.out::println);
		primesLimit.apply(num).forEach(System.out::println);
	}

	public static void main(String[] args) {
		PrimeStreamOrdinary ps = new PrimeStreamOrdinary();
		ps.printFirstNPrimes(10);
		System.out.println("====");
		ps.printFirstNPrimes(5);
	}

}
