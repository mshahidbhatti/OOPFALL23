package week05_a.GameOfCards;

class Game {
    private final int numPlayers;
    private final Deck deck;
    private final Hand[] playersHands;

    public Game(int numPlayers) {
        this.numPlayers = numPlayers;
        deck = new Deck();
        playersHands = new Hand[numPlayers];
        for (int i = 0; i < numPlayers; i++) {
            playersHands[i] = new Hand();
        }
    }

    public void dealInitialCards() {
        for (int i = 0; i < 5; i++) {
            for (Hand hand : playersHands) {
                Card card = deck.dealCard();
                if (card != null) {
                    hand.addCard(card);
                } else {
                    System.out.println("No more cards in the deck.");
                    return;
                }
            }
        }
    }

    public int playRound(int[] cardIndices) {
        Card highestCard = null;
        int winningPlayer = -1;

        for (int i = 0; i < numPlayers; i++) {
            Card playedCard = playersHands[i].playCard(cardIndices[i]);
            if (playedCard == null) continue;

            if (highestCard == null || playedCard.getValue() > highestCard.getValue()) {
                highestCard = playedCard;
                winningPlayer = i;
            } else if (playedCard.getValue() == highestCard.getValue()) {
                winningPlayer = -1;
            }
        }

        return winningPlayer;
    }

    public Hand[] getPlayersHands() {
        return playersHands;
    }
}
