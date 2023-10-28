/**
 * Class:getAddress
 * @author:Sergio Alejandro Torroledo Gonzalez
 * @version:5.12.13.
 * @written on:10/27/2023
 * Course:ITEC 2140-13 Saturday
 * This class allows the user enter their name,address,city and state .
 * */
package Hw5;

import java.util.Scanner;

public class getAddress {

    public static void main(String[] args) {

    getAddress user = new getAddress();

    Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name: ");

        String name=scanner.nextLine();

        System.out.println("Please enter your address: ");

        String address= scanner.nextLine();

        user.NameAndAddress(name,address);

        System.out.println("Please enter your city: ");
        String city = scanner.nextLine();
        System.out.println("Please enter your state: ");
        String state = scanner.nextLine();
        user.CityAndState(city,state);


    }
    private String name;
    private String address;
    private String city;
    private String state;

    public void NameAndAddress(String name, String address ){
        this.name = name;
        this.address=address;
    }
    public void CityAndState(String city,String state){
        this.city=city;
        this.state=state;

    }
    public void info(){
        System.out.println("Name " +  name);
        System.out.println("Address " + address);
        System.out.println("City " + city);
        System.out.println("State " + state);
    }
}
