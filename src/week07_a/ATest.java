package week07_a;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ATest {
    public static void main(String[] args) throws IOException {

        File f=new File("abc.txt");
        FileReader fr=new FileReader(f);
    }
}
