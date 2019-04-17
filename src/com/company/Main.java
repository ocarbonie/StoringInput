package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        //Declare all variables
        String firstInitial;
        String lastName;
        int houseNumber;
        String streetName;
        String streetType;
        String city = "Rockville";

//        //Ask for user input
//        System.out.println("Enter first initial: ");
//        firstInitial = keyboard.nextLine();
//
//        System.out.println("Enter last name: ");
//        lastName = keyboard.nextLine();
//
//        System.out.println("Enter house number: ");
//        houseNumber = keyboard.nextInt();
//
//        keyboard.nextLine();
//
//        System.out.println("Enter street name: ");
//        streetName = keyboard.nextLine();
//
//        System.out.println("Enter street type: ");
//        streetType = keyboard.nextLine();
//
//        System.out.println("Enter city: ");
//        city = keyboard.nextLine();

        //Here is another way of testing the Scanner class
        System.out.println("Enter string: ");
        firstInitial = keyboard.next();
        lastName = keyboard.next();
        houseNumber = keyboard.nextInt();
        streetName = keyboard.next();
        streetType = keyboard.next();
        city = keyboard.next();



        System.out.print(firstInitial + " " + lastName + " " + houseNumber + " ");
        System.out.println(streetName + " " + streetType + " " + city);
    }
}
