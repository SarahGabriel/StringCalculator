
public class Calculator
{
	int Add(String number)
	{
		String[] numbers = number.split(",");

		if(number.isEmpty())
		{
			return 0;
		}
		else if(numbers.length > 1)
		{
			return stringToInt(numbers[0]) + stringToInt(numbers[1]);
		}
		else
		{
			return Integer.parseInt(numbers[0]);
		}
	}

	private int stringToInt(String input)
	{
		return Integer.parseInt(input);
	}
}
