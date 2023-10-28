/**
 * Class:Fibonacci
 * @author:Sergio Alejandro Torroledo Gonzalez
 * @version:5.12.9.
 * @written on:10/26/2023
 * Course:ITEC 2140-13 Saturday
 * This class allows the user enter a number and this will display the fibonacci sequence.
 * */
package Hw5;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean printing = true;

        while (printing) {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            printFib(num);

            System.out.print("Would you like to print another sequence? yes or no: ");
            String response = scanner.next().toLowerCase();
            if (!response.equals("yes")) {
                printing = false;
            }
        }

        System.out.println("Task is finish");
        scanner.close();
    }

    public static void printFib(int numTerms) {
        long first = 0;
        long second = 1;
        System.out.print("Fibonacci Sequence for " + numTerms + " terms: ");

        for (int i = 0; i < numTerms; i++) {
            System.out.print(first + " ");
            long nextTerm = first + second;
            first = second;
            second = nextTerm;
        }

        System.out.println();
    }
}
