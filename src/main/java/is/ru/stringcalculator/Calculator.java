package is.ru.stringcalculator;

public class Calculator {

	public static int add(String text){
			if(text == "")
			{
				return 0;
			}
			else if(!text.contains(","))
			{
				return Integer.parseInt(text);
			}

			return -1;
		}
		



}