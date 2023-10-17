package week07_b;

import java.io.*;

public class Driver {
    public static void main(String[] args)  {
        File f=new File("Data.txt");
        try {
            FileReader fr = new FileReader(f);
        }
        catch (FileNotFoundException e){

        }
    }
}
