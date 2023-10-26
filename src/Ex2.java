
/* class: Exercise 2
 * @author: Christina White
 * @version: 1.0
 * @written on: October 14, 2023
 * @course: ITEC 2140 - 13 Saturday
 * description:
Read a String (class method, no parameters) Using the keyword static, define this method.
* Create an instance of the Scanner class.
Prompt the user to enter a String
Using the Scanner instance, read the String
Return the String the user entered
Call the method from the main method

 */
import java.util.Scanner;


public class Ex2 {
    public static String readString() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        return str;
    }

    public static void main(String[] args) {
        String Ex2Class = Ex2.readString();
        System.out.println(Ex2Class);
    }
}
