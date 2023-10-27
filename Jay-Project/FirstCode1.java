
/**
 * Write a description of class ClassOne here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class FirstCode1
{
    public static void main(String[] args)
    {    
       for (int i = 1; i <= 100; i++) {
           if ((i%3) == 0) {
               System.out.println("Fizz");
           }else if ((i%5) == 0){
               System.out.println("Buzz");
           }else{
               System.out.println(i);
           }
       }
    }
}
