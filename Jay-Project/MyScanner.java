import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class MyScanner
{
    public void run() throws FileNotFoundException {
        File dataFile = new File("TestScoresBtClass.csv");
        Scanner scanner = new Scanner (dataFile);
        scanner.useDelimiter("\n");
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }
    
}
    
    public static void main(String[] args) {
       try {
           ScannerReadCSVFile srCsv = new ScannerReadCSVFile();
           srCsv.run();
        } catch (Exception e) {
            System.out.println("File not found");
        }
}
}
