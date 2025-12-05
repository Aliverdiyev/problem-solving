package beginner;

import java.util.Scanner;

/*
Write a program to display the multiplication table of a given integer
*/
public class MultiplicationTable {
    public static void main(String[] args) {
        int x, y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        x = sc.nextInt();
        for (y = 1; y <= x; y++) {
            System.out.println(x + "*" + y + "=" + x * y);
        }
    }
}