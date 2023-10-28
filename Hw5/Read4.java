/**
 * Class:Read4
 * @author:Sergio Alejandro Torroledo Gonzalez
 * @version:5.12.5.
 * @written on:10/23/2023
 * Course:ITEC 2140-13 Saturday
 * This class allows the user to enter text from the keyboard and return the String entered by the user.
 * */
package Hw5;
import java.util.Scanner;
public class Read4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Read4 stringReader = new Read4();
        String inputString = stringReader.readString(scanner);
        System.out.println("You entered: " + inputString);
    }

    public String readString(Scanner scanner) {
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
        return userInput;
    }

}
