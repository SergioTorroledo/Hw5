/**
 * Class:Prime
 * @author:Sergio Alejandro Torroledo Gonzalez
 * @version:5.12.10.
 * @written on:10/26/2023
 * Course:ITEC 2140-13 Saturday
 * This class allows the user enter a number and this will display if the number is prime.
 * */
package Hw5;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number to know if number is prime or not :");
            int number = scanner.nextInt();
            boolean isPrime = isPrime(number);

            if (isPrime) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        }

        public static boolean isPrime(int num) {
            if (num <= 1) {
                return false;
            }

            if (num <= 3) {
                return true;
            }


            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }

            return true;
        }

    }

