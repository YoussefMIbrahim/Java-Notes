package ArraysList;

import java.util.ArrayList;
import java.util.List;

public class HelloAL {

    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>(); // or vector or lniked list
        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add("Youssef");
        arrayList.add("MCTC");
        arrayList.add("Pizza");

        for (String s: arrayList){

            System.out.println(s.toUpperCase());
            System.out.println(s.length());
        }

        System.out.println("My name is: " + arrayList.get(2));

        if (arrayList.contains("Youssef")){
            System.out.println("hey me? ");
        }

        arrayList.remove("MCTC"); // removing by value
        arrayList.remove(1); //removing by index

        int arrayLength = arrayList.size();
        System.out.println(arrayLength);
        System.out.println(arrayList);
    }

}
