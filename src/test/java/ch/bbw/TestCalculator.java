

package ch.bbw;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculator {
	
	Calculator testCalculation;
	
	@Test
	public void testSummeZweiPositive(){

		testCalculation = new Calculator();
		assertTrue(testCalculation.addition(10, 25) == 35);
	}
	
	@Test
	public void testSummeZweiNegative(){
		
		testCalculation = new Calculator();
		assertTrue(testCalculation.addition(-10, -25) == -35);
		
	}
	
	@Test
	public void testSummeZweiNull(){
		
		testCalculation = new Calculator();
		assertTrue(testCalculation.addition(0, 0) == 0);
	}

}
