package testingShit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class gofishTest1 {


    public static void main(String[] args) {

        List<String> deckList = new LinkedList<>();
        int counter = 0;

        String[] deckArray = new String[] { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };

        while (counter < 4)
        {
            Collections.addAll(deckList, deckArray);
            counter ++;
        }
        Collections.shuffle(deckList);

        int handSize = 7;
        List<String> hand = new ArrayList<>(7);

        //  it shouldn't be an issue here, but think about how should you handle with running out of cards to deal?
        System.out.println(deckList);
        if (deckList.size()!=0) {
            for (int i = 0; i < handSize; i++) {
                hand.add(deckList.get(0));

                deckList.remove(0);
//                System.out.println(deckList);

            }
        }

        System.out.println(hand);
        System.out.println(deckList);
    }
}
