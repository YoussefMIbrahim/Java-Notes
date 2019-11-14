package ArraysList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static input.InputUtils.stringInput;

public class GuestList {

    public static void main(String[] args) {


        List<String> guestList = new ArrayList<>();

        while(true){
            String guest = stringInput("Enter Guest name, press enter when you are done: ");
            if (guest.length() == 0 ){
                break;
            }
            if (guestList.contains(guest)) {
                System.out.println("This guest is already on the list");
            }else {
            guestList.add(guest);
            }
        }

        Collections.sort(guestList);

        for (String guest: guestList){
            System.out.println(guest);
        }


        while(true && guestList.size() > 0){
            String guestRemove = stringInput("Enter Guest name you want to remove, press enter when you are done: ");
            if (guestRemove.length() == 0 ){
                break;
            }
            if (!guestList.contains(guestRemove)) {
                System.out.println("This guest is not on the list");
            }else {
                guestList.remove(guestRemove);
            }
        }

        for (String guest: guestList){
            System.out.println(guest);
        }
        System.out.println("There are a total of " + guestList.size() + " guests.");
    }
}
