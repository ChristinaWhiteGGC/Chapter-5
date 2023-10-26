
/* class: Exercise 11
 * @author: Christina White
 * @version: 1.0
 * @written on: October 21, 2023
 * @course: ITEC 2140 - 13 Saturday
 * description:
Create a method reverseString which takes a String as a parameter
* and returns a String with all of the characters reversed.
 */

import java.util.Scanner;


public class Ex11 {

   public String reverseString(String str){
    String newStr = "";
    for(int i = 0; i < str.length(); i++){
        newStr = str.charAt(i) + newStr;
    }
    return newStr;
   }
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter a String: ");
       Ex11 ex = new Ex11();
       String str = ex.reverseString(input.nextLine());
       System.out.println("Your string in reverse is: " + str);
   }
}
