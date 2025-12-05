package math;

import java.util.Scanner;
/*
Write a program to find the sum of all odd numbers from 1 to n
*/
public class SumOfOddNumbersDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;
        while (i < n) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
            i++;
        }
        System.out.println("sum: " + sum);
    }
}