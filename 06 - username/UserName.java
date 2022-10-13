
/**
 * Write a description of class Username here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class UserName {
  public static void main(String[] args) {
    // create Scanner object
    Scanner s = new Scanner(System.in);

    System.out.print("Are you a Student or Teacher? ");
    String choice = s.nextLine();
    System.out.print("Enter First Name: ");
    String firstName = s.nextLine();
    System.out.print("Enter Last Name: ");
    String lastName = s.nextLine();
    System.out.print("Enter Favorite Number: ");
    int favNum = s.nextInt();
    
    if (choice.equals("Student")){
        System.out.println("Hello " +  getName(firstName) + getInitial(lastName) + favNum + "@nycstudents.net");
    }
    else{
        System.out.println("Hello " +  getInitial(firstName) + getName(lastName) + favNum + "@schools.nyc.gov");
    }
    
    s.close();
    
  } // end main method

  /*
   * Name: initialize
   * Purpose: send back the first character (inital) of a nameß
   * Input: a name (String)
   * Return: a single character (String)
   */
  
  public static String getInitial(String n) {
    return n.substring(0, 1);
  } // end initialize method
  public static String getName(String n) {
    return n.substring(0);
  } // end initialize method
} // end class
