package strings;

import java.util.Scanner;

// Write a Java program check if word is Palindrome

class PalindromeChecker {
    public static boolean palindromeCheckerMethod1(String word) {
        int i = 0, j = word.length() - 1;
        while (i < j) {
            if (word.charAt(i) != word.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static boolean palindromeCheckerMethod2(String word) {
        int left = 0;
        int right = word.length() - 1;
        // Iterate until left pointer crosses right pointer
        while (left < right) {
            // Compare characters at left and right pointers (case-insensitive)
            if (Character.toLowerCase(word.charAt(left)) != Character.toLowerCase(word.charAt(right))) {
                return false;
            }
            // Move pointers towards the middle
            left++;
            right--;
        }
        // If loop completes, all characters match and it's a palindrome
        return true;
    }

    static void main() {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();

        if (palindromeCheckerMethod1(word)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }
}