
/* class: Exercise 10
 * @author: Christina White
 * @version: 1.0
 * @written on: October 21, 2023
 * @course: ITEC 2140 - 13 Saturday
 * description:
Write a method, isPrime that takes an int as a
*  parameter and returns true if the number is prime, false if it is not.
 */

import java.util.Scanner;


public class Ex10 {

   public static boolean isPrime(int num){
             if(num <= 1){
           System.out.println(num + " is a not prime number.");
           return false;
       }
        for(int i = 2; i < num; i++){
            if (num % i == 0) {
                System.out.println(num + " is a not prime number.");
                return false;
            }
        }
       System.out.println(num + " is a prime number.");
        return true;

   }
   public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.print("Enter an integer: ");
       Ex10.isPrime(input.nextInt());

   }
}


