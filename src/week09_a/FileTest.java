package week09_a;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) throws IOException {


        File file=new File("data.dat");
        writeToFile(file,"new data");



    }


    public static void writeToFile(File f, String text) throws IOException {
        FileWriter fw=new FileWriter(f, true);

        BufferedWriter bw=new BufferedWriter(fw);
        fw.write(text);
        fw.write("\n");
        fw.close();
    }
}
