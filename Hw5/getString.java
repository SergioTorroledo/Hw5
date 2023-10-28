/**
 * Class:getString
 * @author:Sergio Alejandro Torroledo Gonzalez
 * @version:5.12.1.
 * @written on:10/23/2023
 * Course:ITEC 2140-13 Saturday
 * This class allows the user to enter text from the keyboard and return the String entered by the user.
 * */
package Hw5;

import java.util.Scanner;

public class getString {
    public static void main(String[] args) {
        String userString=getAString();
        System.out.println("You have entered: " + userString);
    }
    public static String getAString(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type a string ");
        String input = scanner.nextLine();
        return input;
    }
}
