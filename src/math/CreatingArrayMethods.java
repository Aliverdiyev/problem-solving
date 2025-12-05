package math;

import java.util.Arrays;

/*
Create 8 arrays with size 10+ and assign values (use all 3 methods of array creation)
 */
public class CreatingArrayMethods {
    public static void main(String[] args) {

// first method
        int[] arr = new int[11];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        arr[5] = 6;
        arr[6] = 7;
        arr[7] = 8;
        arr[8] = 9;
        arr[9] = 10;
        arr[10] = 11;

// second method
        int[] arr1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

// third method
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}