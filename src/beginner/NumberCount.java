package beginner;

import java.util.Scanner;

/*
Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered
 */
public class NumberCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        System.out.println("Enter numbers (enter \"stop\" to stop):");
        while (true) {
            String input = scanner.next();
            if (input.equalsIgnoreCase("stop")) {
                break; // Exit the loop when user enters "stop"
            }
            int num;
            try {
                num = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number or \"stop\".");
                continue;
            }
            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }
        System.out.println("Positive numbers entered: " + positiveCount);
        System.out.println("Negative numbers entered: " + negativeCount);
        System.out.println("Zero values entered: " + zeroCount);
    }
}