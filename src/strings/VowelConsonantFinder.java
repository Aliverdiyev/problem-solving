package strings;

import java.util.HashSet;
import java.util.Scanner;

public class VowelConsonantFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any text: ");
        String text = scanner.nextLine();
        scanner.close();

        int vowelCount = 0;
        HashSet<Character> vowelsFound = new HashSet<>();
        HashSet<Character> consonantsFound = new HashSet<>();

        for (char ch : text.toCharArray()) {
            if (isAlphabetic(ch)) {
                if (isVowel(ch)) {
                    vowelCount++;
                    vowelsFound.add(ch);
                } else {
                    consonantsFound.add(ch);
                }
            }
        }

        System.out.println("Vowels: " + vowelCount);
        if (!vowelsFound.isEmpty()) {
            System.out.print("Vowels found in the text: ");
            for (char vowel : vowelsFound) {
                System.out.print(vowel + " ");
            }
            System.out.println();
        }

        System.out.println("Consonants found in the text: ");
        if (!consonantsFound.isEmpty()) {
            for (char consonant : consonantsFound) {
                System.out.print(consonant + " ");
            }
        } else {
            System.out.println("No consonants found.");
        }
    }

    public static boolean isAlphabetic(char ch) {
        return Character.isLetter(ch);
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}