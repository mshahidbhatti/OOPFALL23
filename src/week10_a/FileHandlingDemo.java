package week10_a;

import week10_a.fileHandling.FileHandlingAPI;

public class FileHandlingDemo {
    public static void main(String[] args) {

        FileHandlingAPI.writeToFile("hello to file!","sample.txt");
         String data=FileHandlingAPI.readFomFile("sample.txt");
        System.out.println(data);
    }
}
