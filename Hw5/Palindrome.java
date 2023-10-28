/**
 * Class:Palindrome
 * @author:Sergio Alejandro Torroledo Gonzalez
 * @version:5.12.12.
 * @written on:10/26/2023
 * Course:ITEC 2140-13 Saturday
 * This class allows the user enter a string and will let you know of that word is a palindrome.
 * */
package Hw5;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a word:");

        String word = scanner.nextLine();

        scanner.close();
        boolean isPalindrome=isPalindrome(word);
        if (isPalindrome){
            System.out.println(word + " is a palindrome.");
        }
        else{
            System.out.println(word + " is not a palindrome.");
        }

    }
    public static boolean isPalindrome(String enter){
         enter = enter.replaceAll("\\s " , "").toLowerCase();
         int left = 0;
         int right = enter.length() - 1;
        while (left < right){
            if (enter.charAt(left) != enter.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;

    }
}
