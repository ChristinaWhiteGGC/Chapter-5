
/* class: Exercise 4
 * @author: Christina White
 * @version: 1.0
 * @written on: October 14, 2023
 * @course: ITEC 2140 - 13 Saturday
 * description:
Read a String (instance method, no parameters) Without using the keyword static, define this method.
* Create an instance of the Scanner class.
Prompt the user to enter a String
Using the Scanner instance, read the String
Return the String the user entered
Create an object of your class in the main method
Using this object, call your method from the main method
 */

import java.util.Scanner;

public class Ex4 {
    public String readString() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        return str;
    }
    public static void main(String[] args) {
        Ex4 ex = new Ex4();
        String inputString = ex.readString();
        System.out.println(inputString);
    }
}