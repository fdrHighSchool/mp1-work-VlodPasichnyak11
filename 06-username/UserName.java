
/**
 * Creates an Email for Students & Teachers w/First Name, Last Name, & Fav Number.
 *
 * Volodymyr Pasichnyak
 * 10/14/2022
 */

import java.util.Scanner; // Import Java Scanner

public class UserName {
  public static void main(String[] args) {
    // Create Scanner Object
    Scanner s = new Scanner(System.in);

    //Asks for First Name, Last Name, and Favorite Number
    System.out.print("Are you a Student or Teacher? ");
    String choice = s.nextLine();
    System.out.print("Enter First Name: ");
    String firstName = s.nextLine();
    System.out.print("Enter Last Name: ");
    String lastName = s.nextLine();
    System.out.print("Enter Favorite Number: ");
    int favNum = s.nextInt();
        
    if (choice.equals("Student")){ // Generate @nycstudents.net if Student
        System.out.println("Hello " +  getName(firstName) + getInitial(lastName) + favNum + "@nycstudents.net");
    }
    else{ // Generate @shools.nyc.gov if Teacher
        System.out.println("Hello " +  getInitial(firstName) + getName(lastName) + favNum + "@schools.nyc.gov");
    }

    s.close(); //Close Scanner
    
  } // End Main Method

  /*
   * Name: getInitial
   * Purpose: Send Back the First Character (Inital) of a Nameß
   * Input: A Name (String)
   * Return: A Single Character (String)
   */
  
  public static String getInitial(String n) {
    return n.substring(0, 1);
  } // End getInitial Method

  /*
   * Name: getName
   * Purpose: Replicates Full First or Last Name 
   * Input: A Name (String)
   * Return: A Sequence of Characters (String)
   */

  public static String getName(String n) {
    return n.substring(0);
  } // End getName Method
  
  public static String generatePassword(int length) {
    String password;

    
    // loop 'length' times
    
    // generate a random number
    // from 65 - 90 CAPITAL letters
    // from 97 - 122 lowercase
    // from 33 - 47 for special characters

    int max = 90;
    int min = 65;
    int rand = (int)(Math.random() * (max - min + 1) + min);
    char c = (char) rand;
    
    System.out.println(rand + " " + c);
    // convert the random int to char, ex: c =(char)i;

    // add the char to password
  } // end generatePassword method
} // End Class
