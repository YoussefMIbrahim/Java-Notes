package testingShit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class goFishTest2 {

    public static void main(String[] args) {

        String card = "3";
        List<String> fromHand = new ArrayList<>();
        List<String> toHand = new ArrayList<>();

        fromHand.add("1");fromHand.add("1");fromHand.add("1");fromHand.add("2");fromHand.add("3");fromHand.add("3");


        System.out.println(fromHand);
        System.out.println(toHand);

        if (fromHand.contains(card)){
            for (int i = 0; i < fromHand.size(); i++){
                int frequency = Collections.frequency(fromHand,card);
                if (frequency > 1){

                    if (fromHand.contains(card)) {
                        for (int x = 0; x < frequency; x++) {
                            toHand.add(card);
                            fromHand.remove(card);
                        }
                    }
                }

            }
        }

//        if (fromHand.contains(card)){
//            for (int i = 0; i < fromHand.size(); i++){
//                if (fromHand.get(i).equals(card)){
//                    toHand.add(card);
//                    for (int x = 0; x< fromHand.size();x++) {
//                        fromHand.remove(card);
//                    }
//                }
//            }
//        }

        System.out.println(fromHand);
        System.out.println(toHand);

    }
}
