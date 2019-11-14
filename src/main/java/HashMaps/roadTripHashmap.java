package HashMaps;

import java.util.HashMap;
import java.util.Map;

import static input.InputUtils.intInput;
import static input.InputUtils.positiveIntInput;

public class roadTripHashmap {

    public static void main(String[] args) {

        Map <String , Integer> cities = new HashMap<>();

        cities.put("Duluth" , 154);
        cities.put("Brainerd" , 127);
        cities.put("Stillwater" , 26);
        cities.put("Red Wing", 54);
        cities.put("Ely" , 245);

        int distance = positiveIntInput("How far do you want to drive for your trip?");

        for (String city: cities.keySet()){
            //int cityDistance = cities.get(city);
            System.out.println(city);
            if (cities.get(city) < distance){
                System.out.println(city);
            }
        }
    }

}
