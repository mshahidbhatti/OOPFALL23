package week07_a;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
       /*
        try{
        }
        finally{
        }



        */
        System.out.println("Welcome to our expert system");
        Scanner input =new Scanner(System.in);
        int a=10;
        int b=10;
        int arr[]={1,2,3};

        try{
           // risky+ dependent code
            a=input.nextInt();
            b=input.nextInt();
            System.out.println("a / b ="+(a/b));
            System.out.println(arr[10]);
        }

        catch(InputMismatchException e){
            //recovery or messaging statements
            System.out.println("input mismatch exception");
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic exception");
        }
        catch (ArrayIndexOutOfBoundsException | ClassCastException e){
            System.out.println("runtime exception");
        }
        catch (Exception e){
            System.out.println("inside exception");
        }
        catch (Throwable e){

        }
        finally
        {
            // finally will execute wehther exception occur or not
            System.out.println("inside finally block");
        }



        System.out.println("Thank you for using our expert system");
    }
}
