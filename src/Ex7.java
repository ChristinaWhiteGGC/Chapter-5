/* class: Exercise 7
 * @author: Christina White
 * @version: 1.0
 * @written on: October 21, 2023
 * @course: ITEC 2140 - 13 Saturday
 * description:
Write a method, getInput, that allows the user to enter a String and returns this value to be printed
* using your printString method defined above. Again, do not use the static keyword on your methods
* other than main.
*/

import java.util.Scanner;

public class Ex7 {

    //method 1:
    public String getInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an string: ");
        String str = input.nextLine();
        return str;

    }

    public void printString(String str) {
        System.out.print(str);
    }

    public static void main(String[] args) {
        Ex7 ex = new Ex7();
        String result = ex.getInput();
        ex.printString(result);
    }
}