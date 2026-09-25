// Contrasts switch expressions with traditional switch statements using the
// "12 Days of Christmas" song, where each day's gift is cumulative with the ones before it
public class SwitchComparison {
    public static void main(String[] args) {
        for (int day = 1; day <= 12; day++) {
            System.out.printf("Day %d gift: %s%n", day, getGiftExpression(day));
        }

        System.out.println();

        for (int day = 1; day <= 12; day++) {
            System.out.printf("Day %d gifts: %s%n", day, getGiftsStatement(day));
        }
    }

    // PRO: concise, no break needed, compiler enforces exhaustiveness (default
    // required)
    // CON: no fall-through, so it cannot express the cumulative nature of the song
    // directly;
    // each day's full gift list must be spelled out even though it repeats prior
    // days
    public static String getGiftExpression(int day) {
        return switch (day) {
            case 1 -> "A partridge in a pear tree";
            case 2 -> "Two turtle doves";
            case 3 -> "Three French hens";
            case 4 -> "Four calling birds";
            case 5 -> "Five gold rings";
            case 6 -> "Six geese a-laying";
            case 7 -> "Seven swans a-swimming";
            case 8 -> "Eight maids a-milking";
            case 9 -> "Nine ladies dancing";
            case 10 -> "Ten lords a-leaping";
            case 11 -> "Eleven pipers piping";
            case 12 -> "Twelve drummers drumming";
            default -> throw new IllegalArgumentException("Invalid day: " + day);
        };
    }

    // PRO: fall-through lets each case add its own gift and continue accumulating
    // every gift
    // that follows, which naturally models the cumulative verses of the song
    //
    // CON: requires a mutable variable and careful ordering (highest day first, no
    // break)
    // instead of the compiler-checked, self-contained cases a switch expression
    // provides
    public static String getGiftsStatement(int day) {
        StringBuilder gifts = new StringBuilder();

        // Cases run from 12 down to the requested day so execution falls through and
        // accumulates every gift for days at or below "day"
        switch (day) {
            case 12:
                gifts.append("Twelve drummers drumming, ");
            case 11:
                gifts.append("Eleven pipers piping, ");
            case 10:
                gifts.append("Ten lords a-leaping, ");
            case 9:
                gifts.append("Nine ladies dancing, ");
            case 8:
                gifts.append("Eight maids a-milking, ");
            case 7:
                gifts.append("Seven swans a-swimming, ");
            case 6:
                gifts.append("Six geese a-laying, ");
            case 5:
                gifts.append("Five gold rings, ");
            case 4:
                gifts.append("Four calling birds, ");
            case 3:
                gifts.append("Three French hens, ");
            case 2:
                gifts.append("Two turtle doves, ");
            case 1:
                gifts.append("A partridge in a pear tree");
                break;
            default:
                return "Invalid day";
        }

        return gifts.toString();
    }
}
