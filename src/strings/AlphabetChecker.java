package strings;

import java.util.Scanner;

// Write a program to check whether a character is alphabet or not

public class AlphabetChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char character = sc.next().charAt(0);
        if ((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z')) {
            System.out.println(character + " is an alphabet.");
        } else {
            System.out.println(character + " is not an alphabet.");
        }
    }
}