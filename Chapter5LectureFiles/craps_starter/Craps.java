package craps_starter;

/**
 * Fig. 5.4: Craps.java
 * You will use this starter code to implement a game of Craps
 * You will do a combination of decomposing the figure from the textbook and
 * implementing the game logic.
 * combined with using the Die class to roll the dice.
 * You will extend the textbook example to include betting and a simple user
 * interface.
 * 
 * CSci 2001 - Unit 5: Methods
 * 
 * @author Charlie Gorrill
 * @attribution: this code is based on the example in the textbook
 *               "Java: How to Program: An Object Neutral Approach"
 *               by Paul Deitel and Harvy Deitel, 12th edition.
 */
//

public class Craps {
    private enum Status {
        CONTINUE, WON, LOST
    }

    // Plays one game of craps.
    public static void main(String[] args) {
        /**
         * TODO: implement the main method to play a round of craps.
         * The order of play is as follows:
         * 1. Call the comeOut method to simulate the first roll of the round.
         * 2. If the comeOut method returns -1, the player loses and the round is over.
         * 3. If the comeOut method returns 1, the player wins and the round is over.
         * 4. If the comeOut method returns any other value,
         * that value is the point and the player continues rolling.
         * 5. Call the rollOn method with the point value to simulate subsequent rolls.
         * 6. Evaluate the return value of rollOn to determine if the player has won or
         * lost.
         * 7. Print the result of the round
         * 8. Resolve the betting.
         * 
         */
    }

    /**
     * the comOut method will simulate the first roll
     * of a round of craps.
     * 
     * @return -1 if the player loses, 1 if the player wins,
     *         otherwise return the point value.
     *         TODO: implement the comeOut method to return
     *         the correct value based on the rules of craps.
     */
    public static int comeOut() {
        return -1;
    }

    /**
     * The rollOn method will simulate the subsequent rolls
     * of a round of craps.
     * 
     * @return the Status of the game after the player is done rolling.
     * 
     *         TODO: implement the rollOn method to return the correct value based
     *         on the rules of craps.
     *         the player will continue rolling until they either roll
     *         the point value again (WON) or roll a 7 (LOST).
     *         You will need to return the correct Status based on the outcome of
     *         the rolls.
     */
    public static Status rollOn(int point) {
        return Status.CONTINUE;
    }

    /**
     * The playRound method will simulate a round of craps.
     * 
     * @return the Status of the game after the round is complete.
     *         This return value can be used resolve the betting for the round.
     */
    public static Status playRound() {
        return Status.CONTINUE;
    }

    /**
     * rollDice method simulates rolling two dice, calculates the sum,
     * and displays the results.
     * 
     * @return the sum of the two dice.
     *         TODO: implement the rollDice method to return the sum of two dice
     *         rolls.
     *         You will need to create a Die object to complete this method.
     *         The method should print the results of the roll as follows:
     *         "Player rolled 1 + 2 = 3"
     */
    public static int rollDice() {
        int sum = 0; // to be calculated after rolling the dice
        return sum;
    }
}
