
/* class: Exercise 12
 * @author: Christina White
 * @version: 1.0
 * @written on: October 21, 2023
 * @course: ITEC 2140 - 13 Saturday
 * description:
Create a method, isPalindrome, which returns true if the
* String passed to it is a palindrome and false if it is not.
 */

import java.util.Scanner;


public class Ex12 {
    public boolean isPalindrome(String pal) {
        int low = 0;
        int high = pal.length() - 1;
        pal = pal.toLowerCase();
        while (low < high) {
            if (pal.charAt(low) != pal.charAt(high)) {
                return false;
            }
            low++;
            high--;
        }
        return true;
    }


    public static void main(String[] args) {
        Ex12 checkPalindrome = new Ex12();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string value: ");
        String str = input.nextLine();
        if (checkPalindrome.isPalindrome(str)) {
            System.out.println(str.toUpperCase() + " is a palindrome");
        } else {
            System.out.println(str.toUpperCase() + " is not a palindrome");
        }
    }
}