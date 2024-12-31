import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Indtast det første tal: ");
            double num1 = scanner.nextDouble();
            System.out.print("Indtast operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);
            System.out.print("Indtast det andet tal: ");
            double num2 = scanner.nextDouble();

            double result;
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        throw new ArithmeticException("Division med 0 er ikke tilladt.");
                    }
                    result = num1 / num2;
                    break;
                default:
                    throw new IllegalArgumentException("Ugyldig operator: " + operator);
            }
            System.out.println("Resultatet er: " + result);
        } catch (ArithmeticException | IllegalArgumentException e) {
            System.out.println("Fejl: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Fejl: Ugyldigt input.");
        } finally {
            scanner.close();
        }
    }
}
