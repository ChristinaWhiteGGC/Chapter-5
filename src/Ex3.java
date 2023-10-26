
/* class: Exercise 3
 * @author: Christina White
 * @version: 1.0
 * @written on: October 14, 2023
 * @course: ITEC 2140 - 13 Saturday
 * description:
Read a String (class method, Scanner passed as a parameter) Using the keyword static, define this method.
Prompt the user to enter a String
Using the Scanner instance passed to the method, read the String
Return the String the user entered
Create an instance of the Scanner class in the main method
Call the method from the main method passing the Scanner instance as a parameter
 */

import java.util.Scanner;


public class Ex3 {
    public static String readString(Scanner input) {
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        return str;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println(Ex3.readString(sc));
    }
}