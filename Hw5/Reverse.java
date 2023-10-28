/**
 * Class:Reverse
 * @author:Sergio Alejandro Torroledo Gonzalez
 * @version:5.12.11.
 * @written on:10/26/2023
 * Course:ITEC 2140-13 Saturday
 * This class allows the user enter a String and show how does look in reverse.
 * */
package Hw5;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a String: ");
        String enter = scanner.nextLine();
        String reverse = reverseString(enter);
        System.out.println("String enter " + enter );
        System.out.println("String in reverse " + reverse);

    }
    public static  String reverseString (String reverseString){
    StringBuilder reversed = new StringBuilder(reverseString);
    reversed.reverse();
    return reversed.toString();
    }
}
