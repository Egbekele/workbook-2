package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class theaterreservations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // full name
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine().trim();


        // date of the show
        System.out.print("What date will you be coming (MM/dd/yyyy): ");
        String time = scanner.nextLine().trim();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate movieday = LocalDate.parse(time, formatter);


        // number of tickets need
        System.out.print("How many tickets would you like? ");
        String ticket = scanner.nextLine().trim();
        int tickets = Integer.parseInt((ticket));

        // split the name
        String[] names = name.split(" ");
        if (names.length == 2) {
            String names1 = (names[0]);
            String names2 = (names[1]);

        }

        // Display
        if (tickets > 1) {
            System.out.print(ticket + " tickets " + "reserved for " + movieday + " under " +
                    names[1] + ", " + names[0]);
        } else {
            System.out.print(ticket + " ticket " + "reserved for " + movieday + " under " +
                    names[1] + ", " + names[0]);

        }

    }


}
