
import die_rolling.Die;

/*
    an enum is a special class-like type that represents
    a fixed set of named constants.
    Enums are useful for representing a small set of related values
    such as the days of the week
    the suits in a deck of cards (which we will see in a later unit)
    or the states of a game.
*/
enum State {
    RUNNING, GAME_OVER
}

public class EnumBasics {
    public static void main(String[] args) {
        Die die = new Die(6); // A six-sided die object.

        // we need a variable to hold the current state
        State currentState = State.RUNNING; // our enum type is State

        int score = 0;
        System.out.println("Current state: " + currentState);
        System.out.println("Current score: " + score);

        // we check the current state against a desired state
        while (currentState == State.RUNNING) {
            System.out.println("Game is running...");
            int roll = die.roll();// roll is an instance method. Call it to an object
            if (roll > 1) {
                System.out.println("Rolled a " + roll);
                score += roll;
                System.out.println("Current score: " + score);
            } else {
                System.out.println("Rolled a 1! Game over.");
                currentState = State.GAME_OVER; // we change the state if the roll is 1
            }
        } // end of game loop
    }

}
