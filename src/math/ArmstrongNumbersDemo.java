package math;

/*
Write a program to print all Armstrong numbers from 1 to 500 (If the sum of the cubes of each digit of a number is equal to that number itself,
then the number is called an Armstrong number).
Sample -> 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )
 */
public class ArmstrongNumbersDemo {
    public static void main(String[] args) {
        for (int number = 1; number <= 500; number++) {
            int originalNumber = number;
            int sum = 0;
            int digits = String.valueOf(number).length();
            while (originalNumber != 0) {
                int digit = originalNumber % 10;
                sum += (int) Math.pow(digit, digits);
                originalNumber /= 10;
            }
            if (sum == number) {
                System.out.println(number);
            }
        }
    }
}