package math;

import java.util.Scanner;
/*
Write a program in Java to display the multiplication table(from 1 to 10) (check the picture for output)
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x: ");
        int x = sc.nextInt();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int i = 0;
        while (i < arr.length) {
            i++;
            int multiple = x * arr[i - 1];
            System.out.println(x + "*" + arr[i - 1] + "=" + multiple);
        }
    }
}