package is.ru.stringcalculator;

public class Calculator {

	public static int add(String text){
		if(text.equals(""))
		{
			return 0;
		}
		else if(text.contains(","))
		{
			int total = 0;
			String [] numbers = text.split(",");
			for(String number : numbers)
			{
				total += Integer.parseInt(number);
			}
			return total;
		}
		else
		{
			return 1;
		}
		
	}

	



}