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
        
        // our program.
    }

    /**
     * This is the main event loop for our PDA program
     */
    public void runEventLoop() {
        int age;
        int Minor = 18;
        Scanner scanner =new Scanner(System.in);
        int LOWER_BOUND = 0;
        while (true) {
            System.out.println("How old are you?");
            try {
                age = scanner.nextInt();
                if (age < LOWER_BOUND) {
                    System.out.println(Math.round(age)+" is not possible, please enter your real age.");
                } else if (age < Minor) {
                    System.out.println(Math.round(age)+" is too young!");
                } else{
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
