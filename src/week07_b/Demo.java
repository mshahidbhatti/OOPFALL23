package week07_b;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Welcome to our Expert System");
        int list[]={1,2,3,4};
        int var1=0;
        int var2=1;
        int result=0;
        Scanner input=new Scanner(System.in);
        try{

            var1=input.nextInt();
            var2=input.nextInt();
            result=var1/var2;
            System.out.println(list[5]);
        }

       catch (InputMismatchException e){
           System.out.println("Exception occured in inputmismatch.."+e.toString());
//           System.out.println(e.getStackTrace());
       }
        catch (ArithmeticException e){
            System.out.println("Arithmetic Exception" );
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("invalid array index");
        }
        catch (Exception e){

        }
        catch (Throwable e){

        }
        finally {

        }




        System.out.println(result);

        System.out.println("Thank you for using this Expert Sysytem");
    }
}
