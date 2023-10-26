
/* class: Exercise 14
 * @author: Christina White
 * @version: 1.0
 * @written on: October 25, 2023
 * @course: ITEC 2140 - 13 Saturday
 * description:
Create a class that allows users to enter their name and their high score for the game.
* You should enter the name in a method which returns a String. You should pass the name to a
* method to allow the user to enter a String. Print the name and score from a method printScore.
*  Allow the user to continue to enter users and scores until they do not enter a name.
 */


import java.util.Scanner;


public class Ex14 {
    public static String userName() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        return name;
          }

    public static double userScore() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your high score: ");
        return input.nextDouble();
    }
    public static void printScore(String name, double score) {
        System.out.printf("Name: %s, High Score: %.2f\n", name, score);
    }

    public static void main(String[] args) {
           while (true) {
            String name = userName();
            for (int i = 0; i < name.length(); i++) {
                char c = Character.toLowerCase(name.toLowerCase().charAt(i));
                if (c < 'a' || c > 'z') {
                    return;
                }
            }
            double score = userScore();
            printScore(name, score);
        }
    }
}

