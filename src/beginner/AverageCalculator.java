package beginner;

import java.util.Scanner;

/*
Write a program to take n numbers from user and calculate their average
*/

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of numbers: ");
        int n = sc.nextInt();

        double sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            double number = sc.nextDouble();
            sum += number;
        }

        double average = sum / n;
        System.out.println("The average is: " + average);
    }
}