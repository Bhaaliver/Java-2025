import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
       LinkedList list = new LinkedList(10);
        try (FileReader fr = new FileReader("Extra/NumberInputs.txt")) {
            StringBuilder sb = new StringBuilder();
            int ch;
            while ((ch = fr.read()) != -1) {
                if (Character.isDigit(ch) || ch == '-' || ch == '+') {
                    sb.append((char) ch);
                } else if (sb.length() > 0) {
                    list.addNode(Integer.parseInt(sb.toString()));
                    sb.setLength(0);
                }
            }
            if (sb.length() > 0) {
                list.addNode(Integer.parseInt(sb.toString()));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
        list.sortInsertion();
        System.out.println("Sorted Linked List:");
        Node current = list.getHead();
        while (current != null) {
            System.out.print(current.getData() + " \n");
            current = current.getNextNode();
        }
        try (java.io.PrintWriter pw = new java.io.PrintWriter("Extra/output")) {
            current = list.getHead();
            while (current != null) {
                pw.println(current.getData());
                current = current.getNextNode();
            }
            System.out.println("Output written to Extra/output");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}