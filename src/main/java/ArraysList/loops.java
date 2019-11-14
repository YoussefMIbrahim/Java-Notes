package ArraysList;

import java.util.ArrayList;
import java.util.List;

import static input.InputUtils.stringInput;

public class loops {

    public static void main(String[] args) {

        List<String> todoList = new ArrayList<>();

        while (true){
            String data = stringInput("Enter a task, or press enter top quit: ");
            if (data.length() == 0) {
                break;
            }
            if (todoList.contains(data.toLowerCase())){
                System.out.println("that task is already in the list");
            }else {
                todoList.add(data);
            }
        }


        for (String task: todoList){
            System.out.println(task);
        }
        System.out.println(todoList.size());
    }
}
