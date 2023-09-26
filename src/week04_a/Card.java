package week04_a;

public class Card {
    final String suit;
    final String rank;
    Card(String suit, String rank){
        this.suit=suit;
        this.rank=rank;
    }

    public String toString(){
        return String.format("%s of %s",rank,suit);
    }

    public String getSuit() {
        return suit;
    }

    public String getRank() {
        return rank;
    }

    public boolean equals(Object  o){
        Card temp=(Card)o; //downcast
        return rank.equals(temp.rank)&&suit.equals(temp.suit);
    }
}
