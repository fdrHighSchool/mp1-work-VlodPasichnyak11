/**
 * Creates a Randomized Password w/Upper & Lower Case Characters & Symbols.
 *
 * Volodymyr Pasichnyak
 * 10/20/2022
 */

import java.util.Scanner; // Imports Java Scanner

public class Password {
  public static void main(String[] args) {
    // Create Scanner Object
    Scanner s = new Scanner(System.in);

    // Obtain String Input from User
    System.out.print("Enter Length of Password: ");
    int length = s.nextInt();

    System.out.println("Password: " + generatePassword(length));
    s.close(); // Closes Scanner
  } // End Main Method
  /*
   * Name: generatePassword
   * Purpose: Generate a Random Password for the User.
   * Input: Length of a Password (int)
   * Return: The Password (String)
   */
  public static String generatePassword(int length) {
    String password = "";

    // Loops 'Length' Times
    for (int i = 0; i < length; i++){
      // Generates a Random Number for 65-90 (CAPITAL Letters)
      int max = 90;
      int min = 65;
      int rand = (int)(Math.random()*(max - min + 1) + min);
      char c = (char)rand;
      
      // Generates a Random Number for 97-122 (Lowercase Letters)
      
      max = 122;
      min = 97;
      rand = (int)(Math.random()*(max - min + 1) + min);
      char a = (char)rand;
      
      // Generates a Random Number for 33-47 (Special Characters)
      
      max = 47;
      min = 33;
      rand = (int)(Math.random()*(max - min + 1) + min);
      char b = (char)rand;
      
      // Add Characters to Password
      password += c; //password = password + c
      password += b; //password = password + b
      password += a; //password = password + a
    }
    
    return password; // Returns Output to the User
    
  } // end generatePassword method
} // End Class
