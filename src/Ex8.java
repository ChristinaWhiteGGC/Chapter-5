
/* class: Exercise 8
 * @author: Christina White
 * @version: 1.0
 * @written on: October 21, 2023
 * @course: ITEC 2140 - 13 Saturday
 * description:
Create a class that asks the user to enter a number. Call a method isEven that returns true or false
* if the number is even. The return from isEven should be passed to printEven which will print
* "The number is even" if the number is even and "The number is odd" if the number is odd. Determination of
* what to print must be done based on the return from the isEven method.
*/

import java.util.Scanner;


public class Ex8 {

    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void printEven(boolean isEven) {
        if (!isEven) {
            System.out.println("The number is odd.");
        } else {
            System.out.println("The number is even.");
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = input.nextInt();

        boolean result = isEven(num);
        Ex8.printEven(result);
    }
}





