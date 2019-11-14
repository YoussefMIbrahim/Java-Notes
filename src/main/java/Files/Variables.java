package Files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Variables {


    public static void main(String[] args) throws IOException {


        FileWriter writer1 = new FileWriter("Variables.txt");
        BufferedWriter bufWriter = new BufferedWriter(writer1);

        int intData = 42;
        double dblData = 2134.321;
        String strData = "java";

        int data = 67;
        int data2 = 65;
        int data3 = 84;

        bufWriter.write(intData + "\n");
        bufWriter.write(dblData + "\n");
        bufWriter.write(strData + "\n");

        bufWriter.write(data);
        bufWriter.write(data2);
        bufWriter.write(data3);
        bufWriter.close();
    }
}
