package week07_a;

import java.io.IOException;

public class CustomExceptionTest {
    public static void main(String[] args) throws  IOException{
        try{
            throw new CustomException("Illegal value");
        }
        catch (CustomException e){
            System.out.println(e.getStackTrace());
        }

        divide();
    }



    static double divide()throws IllegalArgumentException, IOException {
        //
        return 0;
    }


}
