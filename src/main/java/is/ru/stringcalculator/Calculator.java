package is.ru.stringcalculator;

public class Calculator {

	public static int add(String text){
		if(text.equals(""))
		{
			return 0;
		}
		else if(text.contains(",") | text.contains("\n"))
		{
			int total = 0;
			String [] numbers = splittext(text);
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
	private static String[] splittext(String number)
	{
		return number.split ("[,\\n]");
	}




}