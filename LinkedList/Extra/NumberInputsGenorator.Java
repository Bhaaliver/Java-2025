import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class GenerateNumbers {
    public static void main(String[] args) {
        Random rand = new Random();
        StringBuilder sb = new StringBuilder();
        // Clear the file before writing (truncate to zero length)
        try (FileWriter writer = new FileWriter("/Users/oliverlaskowski/Dev/Java/LinkedList/Extra/NumberInputs.txt", false)) {
            writer.write("");
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 10; i++) {
            sb.append(rand.nextInt(100000)); // Generates numbers between 0 and 9999
            sb.append(" ");
        }
        try (FileWriter writer = new FileWriter("/Users/oliverlaskowski/Dev/Java/LinkedList/Extra/NumberInputs.txt")) {
            writer.write(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}