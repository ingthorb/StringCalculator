package is.ru.stringcalculator;
import java.util.ArrayList;
public class Calculator {

	 public static int add(String text) {

            if (text.equals("")) {
                return 0;
            } else if (text.contains("[")) {
                String[] delimeters = text.split("//");
                String fetchingdelimeter = delimeters[1];
                String news = delimeters[1];
                String newDelimeters = fetchingdelimeter.substring((1) , fetchingdelimeter.lastIndexOf("]"));
                String [] news2 =  news.split("\n");
                String newstring = news2[1];
                String replacedelimeter = newDelimeters.replace(newDelimeters, "n");
                String newstringreplaced = newstring.replace(newDelimeters, "n");
                return sum(newdeliminator(newstringreplaced,replacedelimeter));
            }
            else if (text.startsWith("//")) {
                String[] delimeters = text.split("//");
                String fetchingdelimeter = delimeters[1];
                String delimeter = fetchingdelimeter.substring(0, 1);
                String newstring = fetchingdelimeter.substring(2, fetchingdelimeter.length());
                return sum(newdeliminator(newstring, delimeter));
            }
                else if (text.contains(",") | text.contains("\n")) {
                return sum(splittext(text));
            } else {
                return 1;
            }

        }

        private static String[] splittext(String number) {
            return number.split("[,\n]");
        }

        private static int toInt(String number) {
            Integer numb = Integer.parseInt(number);
             if (numb > 1000) {
                return 0;
            } else {
                return numb;
            }
        }

        private static int sum(String[] numbers) {
            int total = 0;
          
            ArrayList<Integer> negativenumbers = new ArrayList<Integer>();
            String negative = "";
            for (String number : numbers) {

                Integer newnumber = toInt(number);
                if(newnumber < 0 )
                {
                    negativenumbers.add(newnumber);
                }
                else
                {
                    total = total + newnumber;
                }
            }
            if(negativenumbers.size() > 1)
            {
                for(int i = 0; i < negativenumbers.size (); i++)
                {

                    negative += negativenumbers.get(i);
                    negative += ",";
                }
                throw new IllegalArgumentException("Negatives not allowed: " + negative);
            }
            return total;
        }

        private static String[] newdeliminator(String number, String delimeter) {
            return number.split(delimeter);
        }


    }

