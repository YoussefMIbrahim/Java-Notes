package loops;

import java.util.Random;

import static input.InputUtils.intInput;
import static input.InputUtils.stringInput;

public class Password {

    public static void main(String[] args) {


        String secretPassword = "cats";
        String userPassword = "";

        // while password wrong try again
        while (! secretPassword.equals(userPassword)){

            userPassword = stringInput("Enter password ");
        }

        System.out.println("correct!");


        //int secretNumber = 11;
        Random random = new Random();

        int secretNumber = random.nextInt(10);

        int userAnswer = 0;

        do{
            userAnswer = intInput("guess a number between 1 and 10");

            if (userAnswer < secretNumber){
                System.out.println("you need to guess lower");
            }
            if (userAnswer > secretNumber){
                System.out.println("you need to guess higher");
            }

        } while (userAnswer != secretNumber);
        System.out.println("you guessed the secret number!");

    }
}
