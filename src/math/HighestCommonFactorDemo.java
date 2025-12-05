package math;

import java.util.Scanner;
/*
Write a program to calculate HCF (ƏBOB) of Two given number.
*/
public class HighestCommonFactorDemo {
    public static void main(String[] args) {
        HighestCommonFactorDemo findHcf = new HighestCommonFactorDemo();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        findHcf.hcfM(sc.nextInt(), sc.nextInt());
    }

    public void hcfM(int a, int b) {
        int hcf = 0;
        for (int i = 1; i <= a || i <= b; i++) {
            if (a % i == 0 && b % i == 0)
                hcf = i;
        }
        System.out.println("HCF of given two numbers is: " + hcf);
    }
}