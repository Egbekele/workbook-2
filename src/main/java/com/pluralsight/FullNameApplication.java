package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Please enter your name: ");

        // Users input
        System.out.print("First name: ");
        String firstname = scanner.nextLine().trim();

        System.out.print("Middle name: ");
        String middlename = scanner.nextLine().trim();


        System.out.print("Last name: ");
        String lastname = scanner.nextLine().trim();


        System.out.print("Suffix: ");
        String suffix = scanner.nextLine().trim();

        // first name will always be there
        String fullname = firstname;


        if (!middlename.isEmpty()) {
            fullname = firstname + " " + middlename;
        }


        fullname = firstname + " " + lastname;

        if (!suffix.isEmpty()) {
            fullname = firstname + ", " + suffix;

        }

        System.out.println("Full name: " + fullname);

    }
}

