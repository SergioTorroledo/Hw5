/**
 * Class:Read
 * @author:Sergio Alejandro Torroledo Gonzalez
 * @version:5.12.2.
 * @written on:10/23/2023
 * Course:ITEC 2140-13 Saturday
 * This class allows the user to enter text from the keyboard and return the String entered by the user.
 * */
package Hw5;
import java.util.Scanner;
public class Read {
    public static void main(String[] args) {
        String input = read();
        System.out.println("You entered: " + input);
    }

    public static String read() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
        scanner.close();
        return userInput;
    }
}
