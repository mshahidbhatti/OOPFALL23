package week4_b;

public class Card {
    final String suit;
    final String rank;

    Card(String suit, String rank){
        this.suit=suit;
        this.rank=rank;
    }

    public String getSuit() {
        return suit;
    }

    public String getRank() {
        return rank;
    }

    @Override
    public String toString(){
        return rank +" of "+suit;
    }
}
