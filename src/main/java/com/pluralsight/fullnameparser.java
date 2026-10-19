package com.pluralsight;

import java.util.Scanner;
import java.util.regex.Pattern;

public class fullnameparser {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);

       // ask for input
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine().trim();

        // splits the inputs
        String [] namesinput = name.split(" ");


        if (namesinput.length == 3) {
            System.out.println("First name: " + namesinput[0]);
            System.out.println("Middle name: " + namesinput[1]);
            System.out.println("Last name: " + namesinput[2]);
        } else if (namesinput.length == 2){
            System.out.println("First name: " + namesinput[0]);
            System.out.println("Last name: " + namesinput[1]);
        }


    }
}
