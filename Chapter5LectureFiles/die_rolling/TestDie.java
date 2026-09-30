package die_rolling;

public class TestDie {
    public static void main(String[] args) {
        Die d6 = new Die(6);
        d6.roll();
        int staticResult = Die.roll(12, 6);
    }
}
