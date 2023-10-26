
/* class: Exercise 15
 * @author: Christina White
 * @version: 1.0
 * @written on: October 25, 2023
 * @course: ITEC 2140 - 13 Saturday
 * description:
Create a method that allows the user to enter the height and width for a rectangle.
You will need to use instance variables to hold the values entered. Once you obtain these measurements,
* call the calculateArea method passing these values to the method. This method should return the area
* of the rectangle. Once you have the area, call a method isLarge which takes as an int argument containing
* the area of the rectangle. This method should return true if the area of the rectangle is greater than 300,
* false if it is less than or equal to 300. Finally, create a method printSize which takes a boolean variable,
* the return of the isLarge method. If the boolean is true, print "This is a large rectangle." If it is false,
* print "This is a small rectangle." Create this program using the static keyword only for the main method.
 */


import java.util.Scanner;

public class Ex15 {
    private int height, width;
    private Scanner input;

    public void rectangleSize() {
        input = new Scanner(System.in);
        System.out.println("Enter the width of the rectangle: ");
        width = input.nextInt();
        System.out.println("Enter the height of the rectangle: ");
        height = input.nextInt();
    }

    public int calculateArea(int height, int width) {
        int area = height * width;
        System.out.println("The area of the rectangle is " + area);
        return area;
    }

    public boolean isLarge(int area) {
        if (area > 300) {
            return true;
        }
        return false;
    }

    public void printSize(boolean large) {
        if (large) {
            System.out.println("This is a large rectangle.");
        } else {
            System.out.println("This is a small rectangle.");
        }
    }

    public static void main(String[] args) {
        Ex15 ex = new Ex15();
        ex.rectangleSize();
        int area = ex.calculateArea(ex.height, ex.width);
        boolean large = ex.isLarge(area);
        ex.printSize(large);
    }
}


