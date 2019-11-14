package Files;

import java.io.*;

public class ToDo {

    public static void main(String[] args) throws IOException {

        String[] months = {"Jan", "Feb", "March"};
        // closes file if code whether code crashes or not
        try(BufferedReader reader = new BufferedReader(new FileReader("monthslistsadfsd.txt")))     {

            BufferedWriter writer = new BufferedWriter(new FileWriter("monthslist.txt"));


            for (String month : months) {
                writer.write(month + "\n");
            }
            writer.close();

            String line = reader.readLine();

            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }


        }catch (IOException e){
            System.out.println("file not found");
        }



    }
}
