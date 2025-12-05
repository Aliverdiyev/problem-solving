package math;

import java.util.Scanner;

/*
The user will enter a number and the number of digits of the number will be printed
*/
public class NumberOfDigitsDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int sum = 0;
        while (n > 0) {
            int l = n % 10;
            n /= 10;
            sum++;
            System.out.println(l);
        }
        System.out.println("number of digits: " + sum);
    }
}