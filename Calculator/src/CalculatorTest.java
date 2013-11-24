import static org.junit.Assert.*;

import org.junit.Test;


public class CalculatorTest
{

	@Test
	public void AddEmptyString()//String number) 
	{
		Calculator calculator = new Calculator();
		int result = calculator.Add("");

		assertEquals(0, result);
	}
}
