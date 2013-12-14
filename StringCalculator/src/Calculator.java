
public class Calculator
{
	int Add(String numbers)
	{
		 if(numbers.isEmpty())
         {
                 return 0;
         }
         return stringToInt(numbers);
	}

	private int stringToInt(String input)
    {
            return Integer.parseInt(input);
    }
}
