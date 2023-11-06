import java.util.Scanner;

public class MyScanner
{
    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (scanner.hasNext()) {
                String str = scanner.next();
                String[] strr = str.split(",");
                for (String Finish : strr) {
                System.out.println(Finish);
            }
            }
    }
}
    
    public static void main(String[] args) {
        MyScanner myScanner = new MyScanner();
        myScanner.run();
    }
}
