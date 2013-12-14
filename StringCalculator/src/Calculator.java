
public class Calculator
{
	private String delimiter = ",|\n";

	int Add(String number)
	{
		String[] numbers = number.split(delimiter);
		int result =0;
		if(number.isEmpty())
		{
			return 0;
		}
		else 
		{
			if(number.startsWith("//") && number.charAt(3)=='\n')
			{
				delimiter+="|";
				delimiter+= number.charAt(2);
				numbers = number.split(delimiter);
				for(int i=2; i<numbers.length; i++)
				{
					result +=Integer.parseInt(numbers[i]);
				}
				return result;
			}
			else return sumNumbers(numbers);
		}
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
