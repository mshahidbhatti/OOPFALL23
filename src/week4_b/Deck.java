package week4_b;

import Week02_B.Car;

import java.util.Random;

public class Deck {
    String suits[]={"Clubs","Diamonds","Hearts","Spades"};
    String ranks[]={"Ace","2","3","4","5","6","7","8","9"
            ,"10","Jack","Queen","King"};
    Card cards[]=new Card[52];

    Deck(){
        int counter = 0;
        for (int j = 0; j < suits.length; j++)
            for (int i = 0; i < ranks.length; i++)
                cards[counter++] = new Card(suits[j], ranks[i]);
    }


    public void displayCards(){
        for(int i=0;i<cards.length;i++)
        System.out.println(cards[i]);
    }

    public void shuffle(){
        Random random=new Random();
        for(int i =0;i<6000;i++)
        {
            Card temp=cards[0];
            int ran=random.nextInt(52);
            cards[0]=cards[ran];
            cards[ran]=temp;

        }
    }
}
