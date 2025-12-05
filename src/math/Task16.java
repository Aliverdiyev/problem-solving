package math;

import java.util.Arrays;
import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Array Limit: ");
        int l = sc.nextInt();
        int[] arr = new int[l];
        for (int i = 0; i < l; i++) {
            System.out.print("Element of arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Array = " + Arrays.toString(arr));
        System.out.print("Even Array Elements = ");
        for (int e : arr) {
            if (e % 2 == 0)
                System.out.print(e + " ");
        }
    }
}