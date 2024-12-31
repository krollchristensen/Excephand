public class PositiveNumberChecker {
    public static void main(String[] args) {
        try {
            checkPositive(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Fejl: " + e.getMessage());
        }
    }

    public static void checkPositive(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Tallet skal være positivt.");
        }
        System.out.println("Tallet er positivt: " + number);
    }
}