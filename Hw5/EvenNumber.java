/**
 * Class:EvenNumber
 * @author:Sergio Alejandro Torroledo Gonzalez
 * @version:5.12.8.
 * @written on:10/26/2023
 * Course:ITEC 2140-13 Saturday
 * This class allows the user enter a number and this program will let you know if is even or odd.
 * */
package Hw5;

import java.util.Scanner;
public class EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number= scanner.nextInt();
        scanner.close();
        boolean isEven= isEven(number);
        Even(isEven);
    }
    public static boolean isEven(int number){

        return number % 2 == 0;
    }
    public static void Even(boolean isEven){
        if(isEven){
            System.out.println("it's an even number");
        }
        else{
            System.out.println("it's an odd number");
        }

    }
}
