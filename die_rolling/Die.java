package die_rolling;

public class Die {
    private int sides;

    public Die(int sides) {
        this.sides = sides;
    }

    public int roll() {
        return (int) (Math.random() * sides) + 1;
    }

    public int roll(int times) {
        int total = 0;
        for (int i = 0; i < times; i++) {
            total += roll();
        }
        return total;
    }

    /**
     * Rolls the die with a bias towards higher or lower numbers.
     * 
     * @param bias a value between 0 and 1 that skews the roll towards higher or
     *             lower numbers
     * @return the result of the biased roll
     */
    public int roll(double bias) {
        /*
         * the bias mechanic works by multiplying the random
         * number by the bias value, which skews the result
         * towards higher or lower numbers depending on the bias value.
         * A bias of 0.5 will produce a uniform distribution,
         * while a bias of 0.75 will skew the results towards higher
         * numbers and a bias of 0.25 will skew the results
         * towards lower numbers.
         */
        return (int) (Math.random() * sides * bias) + 1;
    }

    /**
     * technically, this method is a valid example of overloading
     * It is not recommended to mix static and instance methods
     * in overloading.
     * It violates the principle of least surprise,
     * which states that a method should behave
     * in a way that users expect.
     * If all other methods of a name are instance methods,
     * a static method with the same name can be confusing.
     */
    public static int roll(int sides, int times) {
        int total = 0;
        for (int i = 0; i < times; i++) {
            total += (int) (Math.random() * sides) + 1;
        }
        return total;
    }

    public int getSides() {
        return sides;
    }

}
