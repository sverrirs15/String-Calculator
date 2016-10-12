package is.ru.stringcalculator;

public class Calculator {

	public static int add(String text){
			if(text == "")
			{
				return 0;
			}
			else if(!text.contains(","))
			{
				return StoInt(text);
			}
			else if(text.contains(",") || text.contains("\n"))
			{
				 String[] numbers = splittext(text);

				 return getSum(numbers);
			}

			return -1;
		}

	private static String[] splittext(String text)
	{
		return text.split(",|\n");
	}

	private static int getSum(String[] letters)
	{
		int sum = 0;
		for(int i = 0; i < letters.length; i++)
		{
			sum += StoInt(letters[i]);
		}
		return sum;
	}


	private static int StoInt(String letter)
	{
		return Integer.parseInt(letter);
	}
		



}