package HashMaps;

import java.util.HashMap;
import java.util.Map;

import static input.InputUtils.*;

public class helloHash {

    public static void main(String[] args) {


        Map<String , Double> snowfall = new HashMap<>();

        snowfall.put("January", 3.1);
        snowfall.put("February", 10.8);
        snowfall.put("March", 2.1);

        System.out.println(snowfall);

        snowfall.put("January", 5.0);
        System.out.println(snowfall);

        System.out.println("Snowfall for February: " + snowfall.get("February"));
        System.out.println(snowfall.get("april"));
        int totalSnowfall = 0;
        for (String month: snowfall.keySet()){
            System.out.println("Snowfall for " + month+ " is: " + snowfall.get(month));
        }

        for (Double value: snowfall.values()){
            System.out.println(value);
            totalSnowfall += value;
        }
        System.out.println(totalSnowfall);
        int averageSnowfall = totalSnowfall / snowfall.size();
        System.out.println( averageSnowfall);

        for (Map.Entry<String, Double> KeyValuePair: snowfall.entrySet()){
            System.out.println(KeyValuePair.getKey());
            System.out.println(KeyValuePair.getValue());
        }

        String newMonth = stringInput("What month would you like to add? ");
        double newSnowfall = positiveDoubleInput("How much snowfall was there? ");

        String normalizedNewMonth = normalization(newMonth);

        if (snowfall.containsKey(normalizedNewMonth)){
            System.out.println("Already exists");
            System.out.printf("Currently %s has %f inches of snow \n",
                    normalizedNewMonth,snowfall.get(normalizedNewMonth));
            boolean overwrite = yesNoInput("Overwrite the data?");
            if (overwrite){
                snowfall.put(normalizedNewMonth,newSnowfall);
            }else{
                System.out.println("no data changed.");
            }
        }else{
            snowfall.put(normalizedNewMonth, newSnowfall);
        }
        System.out.printf("%s has %f inches of snow", normalizedNewMonth,snowfall.get(normalizedNewMonth));




    }

    private static String normalization(String newMonth) {

        String monthsLower = newMonth .toLowerCase();
        String firstLetter = newMonth.substring(0,1).toUpperCase();
        String restOfMonth = monthsLower.substring(1);

        String normalized  = firstLetter + restOfMonth;

        return normalized;
    }
}
