package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testEmptyString() {
		assertEquals(0, Calculator.add(""));
	}

	@Test
	public void test1number() {
		assertEquals(1, Calculator.add("1"));
	}

	@Test
	public void test2numbers() {
		assertEquals(3, Calculator.add("1,2"));
	}

	@Test
	public void test2numbersBIG() {
		assertEquals(0, Calculator.add("-100,100"));
	}

	@Test
	public void test5numbers() {
		assertEquals(15, Calculator.add("1,2,3,4,5"));
	}

	@Test
	public void test10numbers() {
		assertEquals(55, Calculator.add("1,2,3,4,5,6,7,8,9,10"));
	}

	@Test
	public void testSplitByNewline() {
		assertEquals(8, Calculator.add("1,3\n4"));
	}


}