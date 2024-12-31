import java.io.*;

public class FileReaderDemo {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Fejl: Filen blev ikke fundet.");
        } catch (IOException e) {
            System.out.println("Fejl: Problem med at læse filen.");
        }
    }
}