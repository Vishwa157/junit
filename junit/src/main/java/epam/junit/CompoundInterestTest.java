package epam.junit;

import static org.junit.Assert.*;

import org.junit.Test;


public class CompoundInterestTest {

	@Test
	
	public void test() {
		CompoundInterest compoundInterestTest = new CompoundInterest();
		double testOutput = compoundInterestTest.CompoundInterestCalculator(2000, 12, 5, .08);
		assertEquals(979.6914166032102, testOutput,0);
	}

}