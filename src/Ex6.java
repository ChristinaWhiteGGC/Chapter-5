
/* class: Exercise 6
 * @author: Christina White
 * @version: 1.0
 * @written on: October 14, 2023
 * @course: ITEC 2140 - 13 Saturday
 * description:
Create a method named sum that takes two numbers and returns the sum of these two numbers.
Sum of Integers
Create a method sum that takes two parameters, both integers. Do not use the keyword static in this method
* declaration. This method should return an integer. Create code in your main method that calls this method.
Sum of Floating Point Numbers
Create a method sum that takes two parameters, both doubles. This method should return a double.
* Do not use the keyword static. Create code in the main method that calls the sum method with two doubles,
*  with two ints and with one double and one int. Which method gets called in each case. Hint, you may want
*  to put a print statement into each method to help determine which method is called.
* Why is the specific method called?
 */


public class Ex6 {

    //method 1:
    public static int sum() {
        int num1 = 3;
        int num2 = 9;
        System.out.print("Method 1: ");
        return num1 + num2;
    }
    //method 2:
    public int sum(int a, int b){
        System.out.print("Method 2: ");
        return a + b;
    }
    //method 3:
    public double sum(double a, double b){
        System.out.print("Method 3: ");
        return a + b;
    }
    public static void main(String[] args) {
        Ex6 sums = new Ex6();

        int resultTwoInts = sums.sum(3, 9);
        System.out.println(resultTwoInts);

        double resultTwoDoubles = sums.sum(2.5, 9.5);
        System.out.println(resultTwoDoubles);

        double resultOneIntOneDouble = sums.sum(2.5, 2);
        System.out.println(resultOneIntOneDouble);
    }
}