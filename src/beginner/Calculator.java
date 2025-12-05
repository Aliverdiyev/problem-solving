package beginner;

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        System.out.println("Select the calculation you want to perform (+,-,*,/):");
        Scanner sc = new Scanner(System.in);
        char calculation = sc.next().charAt(0);
        switch (calculation) {
            // addition
            case '+':
                action();
                System.out.println(add(sc.nextInt(), sc.nextInt()));
                break;
            // subtraction
            case '-':
                action();
                System.out.println(sub(sc.nextInt(), sc.nextInt()));
                break;
            // multiplication
            case '*':
                action();
                System.out.println(mul(sc.nextInt(), sc.nextInt()));
                break;
            // division
            case '/':
                action();
                System.out.println(div(sc.nextInt(), sc.nextInt()));
                break;
            default:
                System.out.println("error, select operator again");
                break;
        }
    }

    //Addition
    public static int add(int x, int y) {
        return x + y;
    }

    //Subtraction
    public static int sub(int x, int y) {
        return x - y;
    }

    //Multiplication
    public static int mul(int x, int y) {
        return x * y;
    }

    //Division
    public static int div(int x, int y) {
        if (y == 0) {
            throw new IllegalArgumentException("the second value cannot be zero");
        }
        return x / y;
    }

    public static void action(){
        System.out.println("Enter the numbers:");
    }
}