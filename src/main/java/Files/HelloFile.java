package Files;

import java.io.*;

public class HelloFile {

    public static void main(String[] args) throws IOException {


        FileWriter writer = new FileWriter("hello.txt");
        BufferedWriter bufWriter = new BufferedWriter(writer);

        FileReader reader = new FileReader("hello.txt");
        BufferedReader bufReader = new BufferedReader(reader);

////        BufferedReader reader =
//                new BufferedReader(new FileReader("hello.txt"));




        bufWriter.write("Not Hello\n");
        bufWriter.write("Nothing here \n");
        bufWriter.write("Good \n");
        bufWriter.close();

        String line  = bufReader.readLine();


        while(line != null){
            System.out.println(line);
            line = bufReader.readLine();
        }

        bufReader.close();
    }
}
