import java.io.*;

public class groceryBillReader {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("bill.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            int count = 0;
            System.out.println("Contents of bill.txt:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                count++;
            }
            br.close();
            System.out.println("\nTotal Number of Lines = " + count);
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
}