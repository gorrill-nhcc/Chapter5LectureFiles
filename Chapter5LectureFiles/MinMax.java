/**
 * Demonstrates methods that find the largest and smallest of three integers.
 * Author: Charlie Gorrill
 * Date: 2026 - 9 - 22
 * Attribution: this code is based on the example in the textbook
 * "Java: How to Program: An Object Neutral Approach"
 * by Paul Deitel and Harvy Deitel, 12th edition.
 */

public class MinMax {
    /**
     * Starts the program.
     *
     * @param args command-line arguments, which are not used by this example
     */
    public static void main(String[] args) {
        var input = new java.util.Scanner(System.in); // fully qualified class name
        System.out.println("Enter three integers separated by spaces: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        System.out.println("The largest value is: " + findMax(a, b, c));
        System.out.println("The smallest value is: " + findMin(a, b, c)); // this does not work yet, but it will after
                                                                          // you complete the findMin method.
    }

    /**
     * Finds the largest value among three integers.
     *
     * @param a the first integer to compare
     * @param b the second integer to compare
     * @param c the third integer to compare
     * @return the largest of {@code a}, {@code b}, and {@code c}
     */
    public static int findMax(int a, int b, int c) {
        // Start with the smallest possible integer so any input can become the maximum.
        int max = Integer.MIN_VALUE;

        // Check each number in turn and remember it when it is larger than the current
        // maximum.
        if (a > max) {
            max = a;
        }
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    /**
     * Finds the smallest value among three integers.
     *
     * @param a the first integer to compare
     * @param b the second integer to compare
     * @param c the third integer to compare
     * @return the smallest of {@code a}, {@code b}, and {@code c}
     */
    public static int findMin(int a, int b, int c) {
        // This method is intentionally incomplete for the classroom exercise.
        // Try finding the minimum with a different approach than findMax.

        return 0;
    }
}
