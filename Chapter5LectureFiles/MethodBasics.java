public class MethodBasics {
    private int sum;

    public static void main(String[] args) {
        // the variables below are local to the main method
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 }; // this variable is tied to the main
        int sum = sumAll(arr);
    } // end of main method scope

    // Single Responsibility Principle
    public static int sumAll(int[] arr) {
        int sum = 0; // this int sum is local to sumAll

        for (int n : arr) {
            sum += n;
        }

        return sum;
    }

    public static void printArray(int[] arr) {
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}// end of class scope
