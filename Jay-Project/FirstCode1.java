
/**
 * Write a description of class ClassOne here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class FirstCode1
{

    int a = 5;
    int b = 2;
    int c = 1;
    int d = -8;
    
    public void run() {
    if (a == 5) {
        System.out.println("SUCCESS");
    } else {
        System.out.println("FAILURE");
        
    }
    if (b == 2) {
        System.out.println("SUCCESS");
    } else {
        System.out.println("FAILURE");
        
    }
    if (c == 2) {
        System.out.println("FAILURE");
    } else {
        System.out.println("SUCCESS");
        
    }
    if (c != 2) {
        System.out.println("SUCCESS");
    } else {
        System.out.println("FAILURE");
        
    }
    if (d == -8 && a == 4) {
        System.out.println("SUCCESS");
    } else {
        System.out.println("FAILURE");
        
    }
}
    
    public static void main(String[] args)
    {        
        FirstCode1 hw = new FirstCode1();
        hw.run();
    }
}
