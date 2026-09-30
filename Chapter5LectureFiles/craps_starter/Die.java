package craps_starter;

import java.util.random.RandomGenerator;

/**
 * RandomGenerator is the current recommended way to
 * generate values in Java. It replaced the Random class.
 * It is blazing fast and has more variety of methods tahn Random.
 * It is not cryptographically secure. If you need security, use Secure Random.
 * SecureRandom is slower but is non-deterministic, this means that two
 * generations
 * at the samer iteration from teh same seed will not produce the same outcome.
 * 
 */

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
