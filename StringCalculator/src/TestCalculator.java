import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class TestCalculator
{
	Calculator calculator = new Calculator();

	@Test
	public void emptyString() throws Exception 
	{
		int result = calculator.Add("");
		assertEquals(0, result);
	}

	@Test
	public void oneNumber() throws Exception
	{
		int result = calculator.Add("1");
		assertEquals(1, result);
	}

	@Test
	public void twoNumbers() throws Exception
	{
		int result = calculator.Add("1,2");
		assertEquals(3, result);
	}

	@Test
	public void moreNumbers() throws Exception
	{
		int result = calculator.Add("1,2,3,4,5");
		assertEquals(15, result);
	}

	@Test
	public void linesBetweenNumbers() throws Exception
	{
		int result = calculator.Add("1\n2,3");
		assertEquals(6, result);
	}

	@Test
	public void delimiter() throws Exception
	{
		int result = calculator.Add("//;\n1;2");
		assertEquals(3, result);
	}

	@Test
	public void negativeNumberWillThrowAnException() 
	{
		int result;
		try
		{
			result = calculator.Add("-1,-3,2");
			assertEquals(1, result);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}
}
