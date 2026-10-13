package die_rolling;

import java.util.Arrays;

/**
 * This class demonstrates method overloading with the Die class.
 * It shows how to call different versions of the roll method
 * based on the number and type of arguments provided.
 * JVM will determine which method to call based on the
 * method signature (number and type of parameters).
 * It does selects the method at compile time.
 */

public class OverloadingExample {
    public static void main(String[] args) {
        Die die = new Die(6); // A six-sided die object.

        int[] biasedRolls = new int[7];
        int[] uniformRolls = new int[7];

        // Call the instance method roll() with no arguments
        int result1 = die.roll();
        System.out.println("Rolled a " + result1);

        // Call the instance method roll(int times) with an integer argument
        int result2 = die.roll(3);
        System.out.println("Rolled a total of " + result2 + " from 3 rolls");

        // Call the instance method roll(double bias) with a double argument
        for (int i = 0; i < 10000; i++) {
            int biasedRoll = die.roll(0.75);
            biasedRolls[biasedRoll]++;
            int uniformRoll = die.roll(0.5);
            uniformRolls[uniformRoll]++;
        }

        System.out.println("Biased roll distribution (0.75 bias):");
        System.out.println("1: " + Arrays.toString(biasedRolls));

        System.out.println("Uniform roll distribution (0.5 bias):");
        System.out.println("1: " + Arrays.toString(uniformRolls));

        // Call the static method roll(int sides, int times) with two integer arguments
        int result4 = Die.roll(6, 5);
        System.out.println("Rolled a total of " + result4 + " from 5 rolls of a 6-sided die");
    }
}
