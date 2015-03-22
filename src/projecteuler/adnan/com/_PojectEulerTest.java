package projecteuler.adnan.com;

import static org.junit.Assert.*;

import org.junit.Test;

public class _PojectEulerTest {

	@Test
	public void multiplesOfThreeAndFive() {
		// Problem 1
		assertEquals(233168, new MultiplesOfThreeAndFive().calculate());
	}
	
	@Test
	public void evenFibonacciNumbers() {
		// Problem 2
		assertEquals(4613732, new EvenFibonacciNumbers().calculate());
	}
	
	@Test
	public void largestPrimeFactor() {
		// Problem 3
		assertEquals(6857, new LargestPrimeFactor(600851475143L).calculate());
	}
}

