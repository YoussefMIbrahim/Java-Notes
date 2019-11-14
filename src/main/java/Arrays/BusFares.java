package Arrays;

import java.util.Arrays;

import static input.InputUtils.positiveDoubleInput;

public class BusFares {

    public static void main(String[] args) {


        String[] days = {"Mon", "Tues", "Wed", "Th","Fri","Sat", "Sun"};

        double[] farePerDay = new double[days.length];

        double total = 0;

        //for (int d = 0; d<7; d++){
        for (int d = 0; d < days.length; d++){

            String dayOfWeek = days[d];
            double dayTotal = positiveDoubleInput(" How much did you spend on " + dayOfWeek);
            farePerDay[d] = dayTotal;
            total += dayTotal;
        }

        System.out.println("All of the fares for the week are " + Arrays.toString(farePerDay));
        System.out.println("Total for the weeks is " + total);
    }
}
