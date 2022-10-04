
/**
 * Write a description of class GuessingGame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.println("Can You Guess my Secret Number from 1 to 100 (Including Both)? ");
      
      int guess;
      System.out.print("Type a Number: ");
      guess = in.nextInt();
      System.out.println("Your Guess: " + guess);
      
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println("My Secret Number: " + number);
        int remainder = (number-guess);
      System.out.println("You Were Off By: " + Math.abs(remainder));
    }
}