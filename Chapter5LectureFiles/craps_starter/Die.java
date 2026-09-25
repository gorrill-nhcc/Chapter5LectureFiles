package craps_starter;

import java.util.random.RandomGenerator;

public class Die {
    int sides;
    // Get the default RandomGenerator for use in method rollDice.
    private final RandomGenerator randomNumbers = RandomGenerator.getDefault();

    public Die(int sides) {
        this.sides = sides;
    }

    public int roll() {
        return randomNumbers.nextInt(1, sides + 1);
    }

}
