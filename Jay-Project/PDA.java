import java.util.Scanner;

/**
 * Permissible Dating Age program
 *
 * @author Mr. Jaffe
 * @version 2021-06-22 Version 1.0.0
 */
import java.util.InputMismatchException;
public class PDA
{

    /**
     * Constructor for objects of class PDA
     */
    public PDA()
    {
        // We don't need to do anything in the constructor for
        // our program.
    }

    /**
     * This is the main event loop for our PDA program
     */
    public void runEventLoop() {
        int age;
        Scanner scanner =new Scanner(System.in);
        int LOWER_BOUND = 18;
        while (true) {
            System.out.println("How old are you?");
            try {
                age = scanner.nextInt();
                System.out.println(age);
                if (age < LOWER_BOUND) {
                    System.out.println(age+" is too young!!");
                } else {
                    System.out.println("Computations go here");                
                }

            } catch (InputMismatchException error) {
                scanner.next();
                System.out.println("Please enter your age");
            }
        }
    }

    /**
     * The main method instantiates and runs the program
     */
    public static void main (String[] args) {
        PDA pda = new PDA();
        pda.runEventLoop();
    }
}
