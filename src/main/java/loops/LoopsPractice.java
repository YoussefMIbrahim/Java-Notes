package loops;

import static input.InputUtils.doubleInput;

public class LoopsPractice {

    public static void main(String[] args) {
        for (int x = 1; x <= 5; x++){
            System.out.println(x);
        }
        for (int y = 10; y >= 0; y--){
            System.out.println(y + "...");
        }

        int miles = 150000;
        int interval = 3000;

        for (int oilChange = 0; oilChange < 8; oilChange++){
            miles = miles + interval;
            System.out.println(miles);

        }

        int daysOfWeek = 7;
        double busFair;
        double busFeeSum = 0;
        double busFeeAvg;
        String currentDay = "Monday";

        for (int day = 1; day <= daysOfWeek; day++){
            if (day == 2){
                currentDay = "Tuesday";
            }
            if (day == 3){
                currentDay = "Wednesday";
            }
            if (day == 4){
                currentDay = "Thursday";
            }
            if (day == 5){
                currentDay = "Friday";
            }
            if (day == 6){
                currentDay = "Saturday";
            }
            if (day == 7){
                currentDay = "Sunday";
            }

            busFair = doubleInput("What did you spend on " + currentDay + "?");
            busFeeSum = busFair + busFeeSum;
        }

        busFeeAvg = busFeeSum/ daysOfWeek;
        System.out.println("Average fee = " + busFeeAvg);

    }
}
