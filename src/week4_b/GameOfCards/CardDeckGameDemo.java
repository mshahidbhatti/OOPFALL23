package week4_b.GameOfCards;

import java.util.Arrays;
import java.util.Scanner;

public class CardDeckGameDemo {
    public static void main(String[] args) {
        final int NUM_PLAYERS = 4;
        Game game = new Game(NUM_PLAYERS);
        game.dealInitialCards();

        Scanner scanner = new Scanner(System.in);
        for (int round = 1; round <= 5; round++) {
            int[] cardIndices = new int[NUM_PLAYERS];
            System.out.println("Round " + round);
            for (int i = 0; i < NUM_PLAYERS; i++) {
                System.out.println("Player " + (i + 1) + "'s turn:");
                System.out.println(Arrays.toString(game.getPlayersHands()[i].getCards()));
                System.out.print("Select a card index (0-based) to play: ");
                cardIndices[i] = scanner.nextInt();
            }
            int winner = game.playRound(cardIndices);
            if (winner == -1) {
                System.out.println("The round was a draw!");
            } else {
                System.out.println("Player " + (winner + 1) + " wins the round!");
            }
        }
        scanner.close();
    }
}