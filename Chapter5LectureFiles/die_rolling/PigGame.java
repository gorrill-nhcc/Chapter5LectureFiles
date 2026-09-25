package die_rolling;

import java.util.Scanner;

enum State {
    // A state makes the possible outcomes of a player's turn explicit.
    ROLLING, HOLD, BUST, WIN
}

public class PigGame {
    // One shared Scanner keeps input handling in decideNextState simple.
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Die die = new Die(6); // A six-sided die object.
        int player1Score = 0;
        int player2Score = 0;

        State player1State = State.ROLLING;
        State player2State = State.ROLLING;

        // The game alternates turns until one player's score reaches the target.
        while (player1Score < 20 && player2Score < 20) {
            System.out.println("Player 1's turn:");
            // Each player uses the same turn method so the rules stay consistent.
            // playTurn is a static (class) method, so we can call it with the class name.
            // We could also call it without the class name since we are in the same class.
            PigGame.playTurn(die, player1Score, player1State);
            if (player1State == State.HOLD) {
                player1Score += player1Score;
                System.out.println("Player 1 holds. Total score: " + player1Score);
            } else if (player1State == State.BUST) {
                System.out.println("Player 1 busts. Total score: " + player1Score);
            }

            if (player1Score >= 20) {
                System.out.println("Player 1 wins!");
                break;
            }

            System.out.println("Player 2's turn:");
            PigGame.playTurn(die, player2Score, player2State);
            if (player2State == State.HOLD) {
                player2Score += player2Score;
                System.out.println("Player 2 holds. Total score: " + player2Score);
            } else if (player2State == State.BUST) {
                System.out.println("Player 2 busts. Total score: " + player2Score);
            }

            if (player2Score >= 20) {
                System.out.println("Player 2 wins!");
                break;
            }
        } // end of game loop

    }

    public static void playTurn(Die die, int playerScore, State playerState) {
        // A player keeps rolling while the chosen state says the turn is active.
        while (playerState == State.ROLLING) {
            int roll = die.roll();
            System.out.println("Rolled: " + roll);
            if (roll == 1) {
                // Rolling a 1 ends the turn immediately and forfeits its turn points.
                playerState = State.BUST;
                System.out.println("Busted! No points this turn.");
            } else {
                // Non-1 rolls add temporary points before the player chooses again.
                playerScore += roll;
                System.out.println("Current score: " + playerScore);
                playerState = decideNextState();
            }
        }
    }

    public static State decideNextState() {

        // The player controls the risk of another roll or protects the current turn
        // total.
        System.out.println("Do you want to hold (h) or roll again (r)?");
        String input = scan.nextLine();

        if (input.equalsIgnoreCase("h")) {
            return State.HOLD;
        } else {
            return State.ROLLING;
        }
    }
}
