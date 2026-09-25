/**
 * Wow, that's a terrible class name.
 * But is is just a class to demonstrate Math class methods.
 * It is not intended to be a useful class.
 * 
 * Static methods cannot work on instance members of a class.
 * They can only touch static members.
 * This is because static members do not require an instance
 * of a class to be invoked, while instance members do.
 * Statics always exist while instances may not exist.
 * 
 * Static methods usually perform operations that
 * work on values passed to them as parameters.
 * They may have a side efect, but they usually return a value.
 * They perform a standalone task.
 * Static methods can be useful for utility
 * classes that provide some functionality without
 * requiring an instance of the class.
 * 
 */

public class MathClassStaticMethods {

    /**
     * Calculates the distance between two points in a 2D space using the distance
     * formula.
     * The distance formula is derived from the Pythagorean theorem and is given by:
     * d = sqrt((x2 - x1)^2 + (y2 - y1)^2)
     * 
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     * @return the distance between the two points
     */
    public static double distanceBetweenPoints(int x1, int y1, int x2, int y2) {
        int deltaX = x2 - x1;
        int deltaY = y2 - y1;
        // Math.pow() is a static method that takes two arguments: the base and the
        // exponent.
        // It returns the base raised to the power of the exponent.
        double discriminant = Math.pow(deltaX, 2) + Math.pow(deltaY, 2);

        // Math.sqrt() is a static method that takes one argument
        // and returns the square root of that argument.
        return Math.sqrt(discriminant);
    }

    /**
     * Calculates the length of the hypotenuse of a right triangle
     * given the lengths of the other two sides.
     * This is done using the Pythagorean theorem: c^2 = a^2 + b^2
     * 
     * @param sideA the length of one side of the triangle
     * @param sideB the length of the other side of the triangle
     * @return the length of the hypotenuse
     */
    public static double calculateHypotenuse(double sideA, double sideB) {
        return Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
    }

    /**
     * Calculates the volume of a sphere given its radius.
     * The formula for the volume of a sphere is: V = (4/3) * π * r^3
     * 
     * @param radius the radius of the sphere
     * @return the volume of the sphere
     */
    public static double calculateVolumeOfSphere(double radius) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    /**
     * Prints a message to the console with the calculation type and result.
     * 
     * @param calcualionType the type of calculation performed
     * @param result         the result of the calculation
     */
    public static void printMessage(String calcualionType, double result) {
        String message = "The " + calcualionType + " is: " + result;
        System.out.println(message);
    }
}
