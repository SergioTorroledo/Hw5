/**
 * Class:Sum
 * @author:Sergio Alejandro Torroledo Gonzalez
 * @version:5.12.6.
 * @written on:10/25/2023
 * Course:ITEC 2140-13 Saturday
 * This class allows the user to enter numbers and add them.
 * */
package Hw5;

public class Sum {
    public static void main(String[] args) {
       Sum mathSolv = new Sum();
       sum(9,10);
       int solution = mathSolv.add(5,4);
        System.out.println("add result " + solution );
        double solution2 = mathSolv.add(4.6,5.5);
        System.out.println("add result " + solution2);
        double solution3=mathSolv.add(5,3.5);
        System.out.println("add result "+ solution3);



    }
    public static int sum (int a , int b){
        System.out.println( a + b);
        return a + b;
    }
    public int add (int c , int d){
       // System.out.println("This will add two numbers in the main method");
        return c + d;
    }
    public double add(double a2, double b2){
       // System.out.println(a2 + b2);
        return a2 + b2;
    }
    public double add(int c2, double d2){
        return c2 + d2;
    }
}
