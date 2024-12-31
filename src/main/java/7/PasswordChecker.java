import java.util.Scanner;
class TooManyAttemptsException extends Exception {
    public TooManyAttemptsException(String message) {
        super(message);
    }
}



public class PasswordChecker {
    public static void main(String[] args) {
        final String CORRECT_PASSWORD = "java123";
        Scanner scanner = new Scanner(System.in);
        int attempts = 0;

        try {
            while (attempts < 3) {
                System.out.print("Indtast adgangskoden: ");
                String input = scanner.nextLine();
                if (input.equals(CORRECT_PASSWORD)) {
                    System.out.println("Adgang godkendt.");
                    return;
                } else {
                    attempts++;
                    System.out.println("Forkert adgangskode. Forsøg igen.");
                }
            }
            throw new TooManyAttemptsException("For mange forkerte forsøg. Adgang nægtet.");
        } catch (TooManyAttemptsException e) {
            System.out.println("Fejl: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
