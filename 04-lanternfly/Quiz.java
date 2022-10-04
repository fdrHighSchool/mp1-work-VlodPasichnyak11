
/**
 * Write a description of class Quiz here.
 *
 * @ Volodymyr Pasichnyak
 * @ 09/29/2022
 */
import java.util.Scanner;

public class Quiz
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("What is x if, 3x + 4 = 7? Enter an Integer: ");
        int num1 = in.nextInt();
        
        if (num1 != 1) {
            System.out.println("Sorry, you are incorrect.");
        } // end if statement
        else {
            System.out.print("Correct. What is x if, 2x + 6 = 4x + 14? Enter an Integer: ");
        }
            int num2 = in.nextInt();
            if (num2 != -4) {
                System.out.println("Sorry, you are incorrect.");
            }
            else{
                System.out.println("Well Done. What is x if, x^2 + 7x + 6? Enter a Set of Integers. ");
                int num3 = in.nextInt();
                int num4 = in.nextInt();
                if (num3 == -1 && num4 == -6 || num4 == -1 && num3 == -6) {
                    System.out.println("Great Job, you have beaten me.");
                }
                else{
                    System.out.println("Sorry, you are incorrect.");
                }
        } // end else statement
    } // end main method
} // end class
