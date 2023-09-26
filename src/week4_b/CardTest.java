package week4_b;

public class CardTest {
    public static void main(String[] args) {

        Deck deck1=new Deck();
        deck1.displayCards();
        System.out.println();
        deck1.shuffle();
        deck1.displayCards();
    }
}
