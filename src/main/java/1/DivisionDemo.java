import java.util.Scanner;

public class DivisionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Indtast det første tal: ");
            int a = scanner.nextInt();
            System.out.print("Indtast det andet tal: ");
            int b = scanner.nextInt();

            int result = a / b;
            System.out.println("Resultatet er: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Fejl: Division med 0 er ikke tilladt.");
        } catch (Exception e) {
            System.out.println("Fejl: Ugyldigt input.");
        } finally {
            scanner.close();
        }
    }
}