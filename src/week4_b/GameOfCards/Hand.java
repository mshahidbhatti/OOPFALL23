package week4_b.GameOfCards;

import java.util.Arrays;

public class Hand {
    private final int MAX_CARDS = 5;
    private final Card[] cardsInHand;
    private int currentSize = 0;

    public Hand() {
        cardsInHand = new Card[MAX_CARDS];
    }

    public void addCard(Card card) {
        if (currentSize < MAX_CARDS) {
            cardsInHand[currentSize++] = card;
        }
    }

    public Card playCard(int index) {
        if (index >= 0 && index < currentSize) {
            Card card = cardsInHand[index];
            for (int i = index; i < currentSize - 1; i++) {
                cardsInHand[i] = cardsInHand[i + 1];
            }
            cardsInHand[--currentSize] = null;
            return card;
        }
        return null;
    }

    public Card[] getCards() {
        Card[] currentCards = new Card[currentSize];
        System.arraycopy(cardsInHand, 0, currentCards, 0, currentSize);
        return currentCards;
    }
}