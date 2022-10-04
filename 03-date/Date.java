
/**
 * Think Java; Chapter 2, Exercise 2. w/ Input.
 *
 * @ Volodymyr Pasichnyak
 * @ 09/28/2022
 */

import java.util.Scanner;

public class Date{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter Day: ");
    String day = in.nextLine();
    System.out.print("Enter Month: ");
    String month = in.nextLine();
    System.out.print("Enter Date: ");
    int date = in.nextInt();
    System.out.print("Enter Year: ");
    int year = in.nextInt();
    in.close(); // closes Scanner
    System.out.println("American Format: " + day + ", " + month + " " + date + ", " + year);
    System.out.println("European Format: " + day + " " + date + " " + month + " " + year);
  }// end of main method
}// end of class