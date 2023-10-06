package week05_a.GameOfCards.inheritance;

public class B extends A{
    int b;


    B(int a, int b){
        super(a);
        System.out.println("Constructor of B");
        this.b=b;
    }
}
