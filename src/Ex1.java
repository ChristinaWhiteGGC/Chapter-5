
/* class: Exercise 1
 * @author: Christina White
 * @version: 1.0
 * @written on: October 14, 2023
 * @course: ITEC 2140 - 13 Saturday
 * description:  Create a method, getString, that allows the user to enter text from the keyboard and return the String entered by the user.
Note: You can only have a single copy of the no parameter and one parameter methods defined in your class at a time. Start with the class methods and then comment them out when you write the instance methods.
 */

import java.util.Scanner;

public class Ex1 {
    /*public static String getString() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        return input.nextLine();
    }*/

    public String getString() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        return input.nextLine();
    }

    public static void main(String[] args) {
      /*  String Ex1Class = Ex1.getString();
        System.out.println("String entered by user returned using Class Method: " + Ex1Class);*/
        Ex1 Ex1Instance = new Ex1();
        String Ex1String = Ex1Instance.getString();
        System.out.println("String entered by user returned using Instance Method: " + Ex1String);
    }
}
