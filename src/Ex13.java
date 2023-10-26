
/* class: Exercise 13
 * @author: Christina White
 * @version: 1.0
 * @written on: October 25, 2023
 * @course: ITEC 2140 - 13 Saturday
 * description:
Create a class with instance variables to hold the name, street address, city, and state for a user.
* You should enter the name and address in the nameAddress method. You should enter the city and
* state in the cityState method. In the main method, print the complete address. You should not use
* the static keyword except for the main method.
 */

import java.util.Scanner;


public class Ex13 {
    private String name, address, city, state;
    public String nameAddress() {
        name = "Christina White";
        address = "812 Marta Crane Drive";
        return name + "\n" + address;

    }

    public String cityState() {
        city = "Lawrenceville";
        state = "GA";
        return city + " " + state;

    }

    public static void main(String[] args) {
        Ex13 output = new Ex13();
        String address = output.nameAddress() + "\n" + output.cityState();
        System.out.println(address);

    }
}