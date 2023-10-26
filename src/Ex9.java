
/* class: Exercise 9
 * @author: Christina White
 * @version: 1.0
 * @written on: October 21, 2023
 * @course: ITEC 2140 - 13 Saturday
 * description:
Write a method, printFib, that takes an integer argument. In this method, create the code required to
 generate A Fibonacci Sequence with that many numbers. Your main method should contain a loop allowing
 * the user to print multiple sequences, ask them if they want to print another sequence.
 */

import java.util.Scanner;


public class Ex9 {

    public static void printFib(int num) {
        int num1 = 0;
        int num2 = 1;
        int i = 0;
        while (i <= num) {
            System.out.print(num1);
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            if (i <= num - 1) {
                System.out.print(", ");
            }
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter number of digits for your Fibonacci Sequence: ");
            Ex9.printFib(input.nextInt());
            System.out.print("\nEnter yes if you would like to print another sequence: ");
            String str = input.next().toLowerCase();
            if (!str.equals("yes")) {
                break;
            }
        }
    }
}






