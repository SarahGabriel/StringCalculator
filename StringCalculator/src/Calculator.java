
public class Calculator
{
	private String delimiter = ",|\n";

	int Add(String number) throws Exception
	{
		String[] numbers = number.split(delimiter);
		String negativeNumbers ="";
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
					if(stringToInt(numbers[i]) > 0)
					{
						result +=stringToInt(numbers[i]);
					}					
				}
				negativeNumbers = stringOfNegativeNumber(2, numbers);
			}
			else
			{
				negativeNumbers = stringOfNegativeNumber(0, numbers);

				result =  sumNumbers(numbers);
			}

			if(negativeNumbers.isEmpty() == false)
			{
				throw new Exception("negatives not allowed " + negativeNumbers);

			}
			else
				return result;

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
	private String stringOfNegativeNumber(int j, String numbers[])
	{
		String negativeNumbers = "";
		for(int i=j; i<numbers.length; i++)
		{
			if(stringToInt(numbers[i]) < 0)
			{
				negativeNumbers += numbers[i] + " ";
			}
		}
		return negativeNumbers;
	}
}
