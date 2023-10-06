package week05_a.GameOfCards.inheritance;

public class C extends B{
    int c;
    C(int a, int b, int c){
        super(a,b);
        System.out.println("constructor of C");
    }
}
