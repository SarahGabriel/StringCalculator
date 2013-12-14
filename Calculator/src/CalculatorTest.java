import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class CalculatorTest
{

	@Test
	public void AddEmptyString()//String number) 
	{
		Calculator calculator = new Calculator();
		int result = calculator.calculate("");

		assertEquals(0, result);
	}
	
	public void enterSingleValue()
	{
		
	}
}
