package is.ru.stringcalculator;
public class Calculator {

	public static int add(String text){
        if(text.equals(""))
        {
            return 0;
        }
        else if(text.startsWith("//"))
        {
            String [] delimeters = text.split("//");
            String fetchingdelimeter = delimeters[1];
            String delimeter = fetchingdelimeter.substring(0,1);
            String newstring = fetchingdelimeter.substring(2, fetchingdelimeter.length());
            return sum(newdeliminator(newstring,delimeter));
		}
        else if(text.contains(",") | text.contains("\n"))
        {
            return sum(splittext(text));
        }
        else
        {
            return 1;
        }

    }
    private static String[] splittext(String number)
    {
        return number.split("[,\n]");
    }
    private static int toInt(String number)
    {
        Integer numb = Integer.parseInt(number);
        if(numb < 0)
        {
         throw new IllegalArgumentException("Negatives not allowed");
        }
        else
        {
        	return numb;
        }
    }
    private static int sum(String [] numbers)
    {
        int total = 0;
        for(String number : numbers){
            total += toInt(number);
        }
        return total;
    }
    private static String[] newdeliminator(String number, String delimeter)
    {
        return number.split(delimeter);
    }
}


