public class TypeInferenceDemo {

    /**
     * Demonstrates local variable type inference (LVTI) with primitive values.
     * The compiler determines each variable's type from its initializer.
     *
     * @param args command-line arguments; not used by this example
     */
    public static void main(String[] args) {
        // These declarations state types that are already clear from their values.
        int explicitCount = 24;
        double explicitPrice = 19.95;
        boolean explicitAvailable = true;

        // var lets Java infer the same primitive types: int, double, and boolean.
        var inferredCount = 24;
        var inferredPrice = 19.95;
        var inferredAvailable = true;

        // the following will error out
        // var fName = "John", lName = "Doe";

        System.out.println("Explicit values: " + explicitCount + ", "
                + explicitPrice + ", " + explicitAvailable);
        System.out.println("Inferred values: " + inferredCount + ", "
                + inferredPrice + ", " + inferredAvailable);
        System.out.println("LVTI reduces repeated type names when the initializer is clear.");
    }
}
