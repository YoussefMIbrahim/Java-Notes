package loops;

import java.util.Date;

public class Clock {

    public static void main(String[] args) throws Exception {

        while (true) {
            Date d = new Date();
            System.out.println(d);
            Thread.sleep(1000);
        }



    }
}
