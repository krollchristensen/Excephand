import java.io.*;

public class MultipleExceptions {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // ArrayIndexOutOfBoundsException

            int result = 10 / 0; // ArithmeticException

            BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
            reader.readLine(); // FileNotFoundException
            reader.close();
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Runtime fejl: " + e.getMessage());
        } catch (FileNotFoundException e) {
            System.out.println("Fil ikke fundet: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Fejl ved læsning af fil: " + e.getMessage());
        }
    }
}
