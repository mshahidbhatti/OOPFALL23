package week07_a;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Driver {
    public static void main(String[] args) throws FileNotFoundException {

        File f=new File("data.txt");

            FileReader fr = new FileReader(f);

    }
}
