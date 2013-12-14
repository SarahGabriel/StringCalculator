import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class TestCalculator
{
	Calculator calculator = new Calculator();
	
	@Test
	public void emptyString()
	{
		int result = calculator.Add("");
		assertEquals(0, result);
	}
	
	@Test
	public void oneNumber()
	{
		int result = calculator.Add("1");
		assertEquals(1, result);
	}
}
