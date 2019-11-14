package Files;

public class nomTOstring {

    public static void main(String[] args) {

        String numberString = "cat";

        try {
             int number = Integer.parseInt(numberString);
             System.out.println(number);
            }catch (NumberFormatException nfe){
             System.out.println("Error, not a number: " + numberString);
        }
    }
}
