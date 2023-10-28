/**
 * Class:GetInput
 * @author:Sergio Alejandro Torroledo Gonzalez
 * @version:5.12.7.
 * @written on:10/25/2023
 * Course:ITEC 2140-13 Saturday
 * This class allows the user enter a String and returns this value to be printed using your printString method defined above.
 * */
package Hw5;

import java.util.Scanner;

public class GetInput {
    public static void main(String[] args) {
        GetInput get = new GetInput();
        String user = get.readinput("");
       get.print(user);

    }
    public String readinput(String input){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
         String  text = scanner.nextLine();
         scanner.close();
        return text ;

    }
    public void print(String entered){
        System.out.println("You have entered " + entered);
    }
}
