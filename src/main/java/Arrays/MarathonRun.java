package Arrays;

public class MarathonRun {

    public static void main(String[] args) {

        double currentDistance = 1;
        double increment = 1.1;
        double targetDistance = 26.2;
        int week = 0;

        while(currentDistance < targetDistance){

            week++;
           //System.out.println("week "+ week+" you need to run " +currentDistance+ " miles");
            System.out.printf("week %d run %.2f\n", week,currentDistance);
            currentDistance *= increment;

        }

    }
}
