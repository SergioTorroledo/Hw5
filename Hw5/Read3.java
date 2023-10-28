/**
 * Class:Read3
 * @author:Sergio Alejandro Torroledo Gonzalez
 * @version:5.12.4.
 * @written on:10/23/2023
 * Course:ITEC 2140-13 Saturday
 * This class allows the user to enter text from the keyboard and return the String entered by the user.
 * */
package Hw5;
import java.util.Scanner;
public class Read3 {
    public static void main(String[] args) {
        Read3 stringReader = new Read3();
        String inputString = stringReader.readString();
        System.out.println("You entered: " + inputString);
    }

    public String readString() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
        scanner.close();
        return userInput;
    }
}
