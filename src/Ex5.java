
/* class: Exercise 5
 * @author: Christina White
 * @version: 1.0
 * @written on: October 14, 2023
 * @course: ITEC 2140 - 13 Saturday
 * description:
Read a String (instance method, Scanner passed as a parameter) Using the keyword static, define this method.
* Prompt the user to enter a String
Using the Scanner instance passed to the method, read the String
Return the String the user entered
Create an object of your class in the main method
Create an object of the Scanner class in the main method
Using the object of your class, call the method passing the Scanner object as the parameter
 */

import java.util.Scanner;

public class Ex5 {
    public String readString(Scanner input) {
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        return str;
    }

    public static void main(String[] args) {
        Ex5 ex = new Ex5();
        Scanner inputSc = new Scanner(System.in);
        String inputString = ex.readString(inputSc);
        System.out.println(inputString);
    }
}