
public class Calculator
{
	int Add(String number)
	{
		String[] numbers = number.split(",");

		if(number.isEmpty())
		{
			return 0;
		}
		else return sumNumbers(numbers);
	}

	private int stringToInt(String input)
	{
		return Integer.parseInt(input);
	}
	
	private int sumNumbers(String[] numbers)
	{
		int number = 0;
		for(int i=0; i<numbers.length; i++)
		{
			number += stringToInt(numbers[i]);
		}
		return number;
	}
}
