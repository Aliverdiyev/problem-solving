package math;

import java.util.Scanner;

/*
4 numbers are entered into the method: a, b, c, d, if the numbers are entered in ascending order, return true, otherwise false.
 */
public class Task10 {
    public static void main(String[] args) {
        int[] numbers = new int[4];
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number");
        numbers[0] = sc.nextInt();
        numbers[1] = sc.nextInt();
        numbers[2] = sc.nextInt();
        numbers[3] = sc.nextInt();
    }


    public static boolean isAscending(int[] arr) {
        // Check if each number is greater than or equal to the previous one
        return arr[0] <= arr[1] && arr[1] <= arr[2] && arr[3] <= arr[4];
    }
}