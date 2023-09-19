
/**
 * Write a description of class ClassOne here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class FirstCode1
{

    int i = 14;
    int k = 6;
    int a = 9;
    int b = 20;

    public void run() {
        do {
            System.out.println("TRUE");
        } while (i < 15);  
        do {
            System.out.println("TRUE");
        } while (k > 5);
        do {
            System.out.println("TRUE");
        } while (a < 10 && b <= 20);
    }

    public static void main(String[] args)
    {        
        FirstCode1 hw = new FirstCode1();
        hw.run();
    }
}
