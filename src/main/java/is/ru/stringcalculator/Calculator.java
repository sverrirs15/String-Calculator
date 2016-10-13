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
				
				checkNeg(numbers);

				return getSum(numbers);
			}
			return StoInt(text);
		}

	private static String[] splittext(String text)
	{
		if(text.startsWith("//"))
		{
			String splitter = "" + text.charAt(2);
			text = text.substring(text.indexOf('\n')+1);
			return text.split(splitter);
		}
		else
		{
			return text.split(",|\n");
		}
	}

	private static int getSum(String[] letters)
	{
		int sum = 0;
		for(int i = 0; i < letters.length; i++)
		{
			int number = StoInt(letters[i]);
			if(number <= 1000)
			{
				sum += number;
			}
		}
		return sum;
	}


	private static int StoInt(String letter)
	{
		return Integer.parseInt(letter);
	}

	private static void checkNeg(String[] letters)
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
	}
		



}