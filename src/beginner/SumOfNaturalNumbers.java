package beginner;

/*
Write a program to calculate the sum of first 10 natural number
*/
public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        int n = 10; // Number of natural numbers
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Sum of the first " + n + " natural numbers is: " + sum);
    }
}
