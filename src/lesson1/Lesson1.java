
package lesson1;


import java.util.Scanner;
/**
 *
 * @author Kostya
 */
public class Lesson1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Prints welcome message
        System.out.println();
        System.out.println("This program calculates sum of two numbers");
        System.out.println("\nPlease enter first number");
        Scanner inFile;
        inFile = new Scanner(System.in);
        float first = inFile.nextFloat();
        System.out.println("\nPlease enter second number");
        float second = inFile.nextFloat();
        float result = first + second ;
        System.out.println();
        System.out.println(first + " + " + second + " = " + result);
             
    }
    
}
