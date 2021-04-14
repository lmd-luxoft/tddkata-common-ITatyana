package tddkata;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class CalculatorTest {

	@Test
	public void Test() {
		Calc calc = new Calc();
		int actual = calc.sum("");
			int expected =0;

			assertEquals(expected,actual);
	}
	@Test
	public void Test1() {
		Calc calc = new Calc();
		int actual = calc.sum("1");
		int expected =1;

		assertEquals(expected,actual);
	}

	@Test
	public void Test2() {
		Calc calc = new Calc();
		int actual = calc.sum(";");
		int expected =0;

		assertEquals(expected,actual);
	}

	@Test
	public void Test3() {
		Calc calc = new Calc();
		int actual = calc.sum(null);
		int expected =0;

		assertEquals(expected,actual);
	}
	@Test
	public void Test4() {
		Calc calc = new Calc();
		int actual = calc.sum("abs");
		int expected =0;

		assertEquals(expected,actual);
	}
	@Test
	public void Test5() {
		Calc calc = new Calc();
		int actual = Integer.parseInt(String.valueOf(calc.sum("0")));
		int expected = 0;

		assertEquals(expected, actual);
	}

	
}