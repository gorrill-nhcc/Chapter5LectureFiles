import java.util.Scanner;

public class MinMax {
    /**
     * Demonstrates finding the largest value among three integers.
     *
     * @param args command-line arguments; not used by this example
     */
    public static void main(String[] args) {
        // Create a Scanner to obtain input from the command window
        // type inference to let the compiler determine the type of the variable
        var input = new Scanner(System.in);

        System.out.println("Enter integers separated by spaces.");
        int num1 = input.nextInt(); // read first integer
        int num2 = input.nextInt(); // read second integer
        int num3 = input.nextInt(); // read third integer

        int largestOfThree = maxValue(num1, num2, num3);

        System.out.printf("The largest of %d, %d, and %d is %d",
                num1, num2, num3, largestOfThree);

    }

    /**
     * Returns the largest of three integer values.
     *
     * @param n1 the first value to compare
     * @param n2 the second value to compare
     * @param n3 the third value to compare
     * @return the greatest of {@code n1}, {@code n2}, and {@code n3}
     */
    public static int maxValue(int n1, int n2, int n3) {
        // Start below every possible int so the first comparison will update max.
        int max = Integer.MIN_VALUE;

        // Each comparison keeps the largest value found so far.
        if (n1 > max) {
            max = n1;
        }
        if (n2 > max) {
            max = n2;
        }
        if (n3 > max) {
            max = n3;
        }
        return max;
    }

    /**
     * Returns the smallest of three integer values.
     *
     * @param n1 the first value to compare
     * @param n2 the second value to compare
     * @param n3 the third value to compare
     * @return the smallest of {@code n1}, {@code n2}, and {@code n3}
     */
    public static int minValue(int n1, int n2, int n3) {
        // TODO: Start with Integer.MAX_VALUE and retain the smallest value found.
        return 0;
    }
}