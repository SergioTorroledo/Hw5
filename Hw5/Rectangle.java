/**
 * Class:Rectangle
 * @author:Sergio Alejandro Torroledo Gonzalez
 * @version:5.12.15.
 * @written on:10/27/2023
 * Course:ITEC 2140-13 Saturday
 * This class allows the user enter the height and width for a rectangle.
 * */
package Hw5;
import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle() ;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the height of the rectangle: ");
        int height = scanner.nextInt();
        System.out.print("Enter the width of the rectangle: ");
        int width = scanner.nextInt();

        rectangle.dimensions(height, width);
        int area = rectangle.calculateArea();
        boolean isLarge = rectangle.isLarge(area);
        rectangle.printSize(isLarge);

        scanner.close();
    }
    private int height;
    private int width;

    public void dimensions(int height, int width) {
        this.height = height;
        this.width = width;
    }


    public int calculateArea() {
        return height * width;
    }

    public boolean isLarge(int area) {
        return area > 300;
    }

    public void printSize(boolean isLarge) {
        if (isLarge) {
            System.out.println("This is a large rectangle.");
        } else {
            System.out.println("This is a small rectangle.");
        }
    }

}
