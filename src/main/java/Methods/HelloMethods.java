package Methods;

import static input.InputUtils.doubleInput;
import static input.InputUtils.stringInput;

public class HelloMethods {

    public static void main(String[] args) {

        String name = stringInput("Please enter your name");
        String greeting = makeGreeting(name);
        System.out.println(greeting);

        double miles = doubleInput("please enter the number of miles");
        double km = milesToKM(miles);
        System.out.println(miles+ " miles is equal to " +km+" Kms" );

        double pounds = doubleInput("enter the number of pounds");
        double kilos = pundsToKilos(pounds);
        System.out.println(pounds + "pounds is equal to " + kilos+ " kilograms ");
    }


    public static String makeGreeting(String n){

        String greeting ="hello " + n + " !";
        return  greeting;

    }

    public static double milesToKM(double miles){

        double km = miles * 1.6;
        return km;

    }

    public static double pundsToKilos(double pounds){

        double kilos = pounds * .45;
        return kilos;
    }

    public static void square(int number){
        int squaredNumber = number * number;
        System.out.println(squaredNumber);
    }
}
