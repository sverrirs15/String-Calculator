package is.ru.stringcalculator;

public class Calculator {

	public static int add(String text){
			if(text == "")
			{
				return 0;
			}
			else if(text.contains(",") || text.contains("\n"))
			{
				String[] numbers = splittext(text);

				return getSum(numbers);
			}
			return StoInt(text);
		}

	private static String[] splittext(String text)
	{
		return text.split(",|\n");
	}

	private static int getSum(String[] letters)
	{
		String negs = "";
		boolean containsneg = false;
		boolean first = true;
	    for(int i = 0; i < letters.length; i++)
	    {
	    	if (StoInt(letters[i]) < 0) 
	    	{
	    		if(first)
	    		{
	    			negs += letters[i];
	    			first = false;
	    		}
	    		else
	    		{
	    			negs += "," + letters[i];
	    		}
	    		containsneg = true;
	    	}
	    }
	    if(containsneg)
	    {
	        throw new IllegalArgumentException("Negatives not allowed: " + negs);
	    }

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