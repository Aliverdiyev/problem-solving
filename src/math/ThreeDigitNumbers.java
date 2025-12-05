package math;

import java.util.Scanner;
/*
Write a Java program to get 4 numbers from user and display a unique three-digit number using user input
Also count how many three-digit numbers there are
Sample output:
123
124
...
431
432
Total number of the three-digit-number is 24
*/
public class ThreeDigitNumbers {
    public static void main(String[] args) {
        int i, j, k;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 4 different number: ");
        int[] n = {sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()};
        for (i = 0; i < n.length; i++) {
            for (j = 0; j < n.length; j++) {
                for (k = 0; k < n.length; k++) {
                    if (n[i] != n[j] && n[i] != n[k] && n[j] != n[k]) {
                        count++;
                        System.out.println(n[i] + " " + n[j] + " " + n[k]);
                    }
                }
            }
        }
        System.out.println("Total number of the three-digit-number is: " + count);
    }
}