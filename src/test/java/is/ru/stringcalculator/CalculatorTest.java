package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest 
{

	@Test
	public void testEmptyString() 
	{
		assertEquals(0, Calculator.add(""));
	}

	@Test
	public void test1number() 
	{
		assertEquals(1, Calculator.add("1"));
	}

	@Test
	public void test2numbers() 
	{
		assertEquals(3, Calculator.add("1,2"));
	}


	@Test
	public void test5numbers() 
	{
		assertEquals(15, Calculator.add("1,2,3,4,5"));
	}

	@Test
	public void test10numbers() 
	{
		assertEquals(55, Calculator.add("1,2,3,4,5,6,7,8,9,10"));
	}

	@Test
	public void testSplitByNewline() 
	{
		assertEquals(8, Calculator.add("1,3\n4"));
	}

	@Test
	public void testSplitByNewlineOnly() 
	{
		assertEquals(7, Calculator.add("3\n4"));
	}

	

	@Test
	public void testNegativeCast() 
	{
		try
		{
			Calculator.add("-1,2");
		} catch (final IllegalArgumentException expected) 
		{
			assertEquals(expected.getMessage(), "Negatives not allowed: -1");
		}
	}

	@Test
	public void testNegativeCastMany() 
	{
		try
		{
			Calculator.add("2,-4,3,-5");
		} catch (final IllegalArgumentException expected) 
		{
			assertEquals(expected.getMessage(), "Negatives not allowed: -4,-5");
		}
	}

	@Test
	public void biggerthan1000ignored() 
	{
		assertEquals(2, Calculator.add("1001,2"));
	}

	@Test
	public void biggerthan1000ignored2() 
	{
		assertEquals(0, Calculator.add("1001,2500,10000"));
	}


}