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
			else if(text.contains(","))
			{
				 String[] numbers = text.split(",|\n");

				 int sum = 0;
				 for(int i = 0; i < numbers.length; i++)
				 {
				 	sum += StoInt(numbers[i]);
				 }
				 return sum;
			}

			return -1;
		}



	private static int StoInt(String letter)
	{
		return Integer.parseInt(letter);
	}
		



}