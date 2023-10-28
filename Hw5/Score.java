/**
 * Class:Score
 * @author:Sergio Alejandro Torroledo Gonzalez
 * @version:5.12.14.
 * @written on:10/27/2023
 * Course:ITEC 2140-13 Saturday
 * This class allows the user enter their name and their high score for the game .
 * */
package Hw5;


import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the score game.");

        while (true) {
            String name = Name(scanner);
            if (name.isEmpty()) {
                System.out.println("No name no game");
                break;
            }

            int score = Score(scanner);
            printScore(name, score);
        }

        scanner.close();

        System.out.println("Thank you for playing!" );
    }

    public static String Name(Scanner scanner) {
        System.out.print("Please enter your name (or press Enter to exit): ");
        return scanner.nextLine().trim();

    }

    public static int Score(Scanner scanner) {
        System.out.print("Please enter your high score: ");
        return scanner.nextInt();
    }

    public static void printScore(String name, int score) {
        System.out.println("Name: " + name);
        System.out.println("High Score: " + score);
    }


}
