
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
    String decision1 = choice.toLowerCase();
    System.out.print("Enter First Name: ");
    String firstName = s.nextLine();
    String decision2 = firstName.toLowerCase();
    System.out.print("Enter Last Name: ");
    String lastName = s.nextLine();
    String decision3 = lastName.toLowerCase();
    System.out.print("Enter Favorite Number: ");
    int favNum = s.nextInt();
        
    if (decision1.equals("student")){ // Generate @nycstudents.net if Student
        System.out.println("Hello " +  getName(decision2) + getInitial(decision3) + favNum + "@nycstudents.net");
    }
    else{ // Generate @shools.nyc.gov if Teacher
        System.out.println("Hello " +  getInitial(decision2) + getName(decision3) + favNum + "@schools.nyc.gov");
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
} // End Class
