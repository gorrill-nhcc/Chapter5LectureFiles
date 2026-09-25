public class SwitchExpressions {
    public static void main(String[] args) {
        // A switch expression (unlike a switch statement) produces a value we can
        // assign or use directly
        for (int day = 1; day <= 7; day++) {
            String dayType = getDayType(day);
            System.out.printf("Day %d is a %s%n", day, dayType);
        }

        // Compare the output above to this traditional switch statement version
        for (int day = 1; day <= 7; day++) {
            String dayType = getDayTypeOldStyle(day);
            System.out.printf("Day %d is a %s (old style)%n", day, dayType);
        }
    }

    // A switch expression must be exhaustive, so a default case is required when
    // using int
    public static String getDayType(int day) {
        return switch (day) {
            // Arrow labels (->) do not fall through to the next case like traditional colon
            // labels do
            // Multiple case values can share one arrow label by separating them with commas
            case 1, 2, 3, 4, 5 -> "Weekday";
            case 6, 7 -> "Weekend";
            default -> {
                // A block body ({ }) lets us run multiple statements before producing a value
                // with yield
                yield "Invalid day";
                /*
                 * yield behaves like a return in that it yields a result
                 * and breaks the switch expression,
                 * but it can only be used inside a switch expression
                 */
            }
        };
    }

    // A traditional switch statement does not produce a value, so we must declare
    // and assign a local variable inside the switch, then return it afterward
    public static String getDayTypeOldStyle(int day) {
        String dayType;

        switch (day) {
            // Colon labels fall through to the next case unless a break statement stops it,
            // so cases 1-4 fall through until they reach the break in case 5
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                dayType = "Weekday";
                break;
            case 6:
            case 7:
                dayType = "Weekend";
                break;
            default:
                // Forgetting break here would let execution fall into whatever came next,
                // but default is last so there is nothing left to fall through to
                dayType = "Invalid day";
                break;
        }

        return dayType;
    }
}
