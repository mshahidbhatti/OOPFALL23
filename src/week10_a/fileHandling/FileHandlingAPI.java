package week10_a.fileHandling;

import week09_b.StringConsumer;

import java.io.*;

public class FileHandlingAPI {

    public static void writeToFile(String content, String filename){


        if(!content.isEmpty()&&!filename.isEmpty()){

            File file=new File(filename);
            FileWriter fileWriter;
            BufferedWriter bufferedWriter;
            try {
                fileWriter=new FileWriter(file, true);
                bufferedWriter=new BufferedWriter(fileWriter);
                bufferedWriter.write(content);
                bufferedWriter.newLine();
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }


    public static String readFomFile(String fileName) {
        File file=new File(fileName);
        StringBuilder stringBuilder=new StringBuilder();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
          //  stringBuilder.append(bufferedReader.readLine()) ;
            String temp="";
                    while((temp=bufferedReader.readLine())!=null){
                     stringBuilder.append(temp);
                    }
            bufferedReader.close();
            fileReader.close();
        }
        catch (FileNotFoundException e){

        }
        catch(IOException e){

        }
        return stringBuilder.toString();
    }
}
