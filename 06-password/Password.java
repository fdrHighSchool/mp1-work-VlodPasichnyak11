import java.util.Scanner;

public class Password {
  public static void main(String[] args) {
    // create Scanner object
    Scanner s = new Scanner(System.in);

    // get String input from user
    System.out.print("Enter length of password: ");
    int length = s.nextInt();

    System.out.println("Your password is: " + generatePassword(length));
    s.close();
  } // end main method
  /*
   * Name: generatePassword
   * Purpose: generate a random password
   * Input: length of password (int)
   * Return: the password (String)
   */
  public static String generatePassword(int length) {
    String password = "";

    // loop 'length' times
    for (int i = 0; i < length; i++){
      // generate a random number
      // from 65 - 90 CAPITAL letters
      int max = 90;
      int min = 65;
      int rand = (int)(Math.random()*(max - min + 1) + min);
      char c = (char)rand;
      // from 97 - 122 lowercase
      
      max = 122;
      min = 97;
      rand = (int)(Math.random()*(max - min + 1) + min);
      char a = (char)rand;
      
      // from 33 - 47 for special characters
      
      max = 47;
      min = 33;
      rand = (int)(Math.random()*(max - min + 1) + min);
      char b = (char)rand;
      
      // add the char to password
      password += c; //password = password + c;
      password += b; //password = password + b;
      password += a; //password = password + a;
      System.out.println(password); 
    }
    
    return password;
    
  } // end generatePassword method

} // end class