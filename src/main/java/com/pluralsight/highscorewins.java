package com.pluralsight;

import java.util.Scanner;
import java.util.regex.Pattern;

public class highscorewins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the game score: ");
        String score = scanner.nextLine().trim();


        String[] scores = score.split(Pattern.quote("|"));
        String[] team = scores[0].split(Pattern.quote(":"));
        String[] points = scores[1].split(Pattern.quote(":"));

        int home = Integer.parseInt(points[0]);
        int visitor = Integer.parseInt(points[1]);

        if (home > visitor) {
            System.out.println("Winner: " + team[0]);
        }

    }
}
