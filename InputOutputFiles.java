import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class InputOutputFiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File inputFile = null;
        while (inputFile == null) {
            System.out.print("Please enter the path to open the input file for example C:\\Downloads\\lines.txt: ");
            String filePath = scanner.nextLine();
            inputFile = new File(filePath);
            try {
                Scanner fileScanner = new Scanner(inputFile);
                PrintWriter writer = new PrintWriter("outlines.txt");
                while (fileScanner.hasNextLine()) {
                    String line = fileScanner.nextLine();
                    writer.println(">> " + line);
                }
                writer.close();
                System.out.println("File successfully processed.");
            } catch (FileNotFoundException e) {
                System.out.println("File is not found, please try again.");
                inputFile = null;
            }
        }
    }
}