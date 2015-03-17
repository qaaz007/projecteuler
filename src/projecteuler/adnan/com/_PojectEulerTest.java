package projecteuler.adnan.com;

import static org.junit.Assert.*;

import org.junit.Test;

public class _PojectEulerTest {

	@Test
	public void multiplesOfThreeAndFive() {
		// Problem 1
		assertEquals(0, new MultiplesOfThreeAndFive().calculate());
	}
	
	@Test
	public void evenFibonacciNumbers() {
		// Problem 2
		assertEquals(0, new EvenFibonacciNumbers().calculate());
	}
}
