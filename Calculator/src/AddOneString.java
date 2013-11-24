import static org.junit.Assert.*;

import org.junit.Test;


public class AddOneString 
{

	@Test
	public void test() 
	{
		Calculator calculator = new Calculator();
		int result = calculator.Add("1");
		assertEquals(1, result);

	}

}
