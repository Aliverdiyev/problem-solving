package strings;

import java.util.HashSet;
import java.util.Scanner;

public class VowelFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any text: ");
        String text = scanner.nextLine();
        scanner.close();

        HashSet<Character> vowelsFound = findVowels(text);

        if (vowelsFound.isEmpty()) {
            System.out.println("No vowels found in the text.");
        } else {
            System.out.print("Vowels found in the text: ");
            for (char vowel : vowelsFound) {
                System.out.print(vowel + " ");
            }
            System.out.println();
        }
    }

    public static HashSet<Character> findVowels(String text) {
        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        HashSet<Character> vowelsFound = new HashSet<>();
        for (char ch : text.toCharArray()) {
            if (vowels.contains(ch)) {
                vowelsFound.add(ch);
            }
        }
        return vowelsFound;
    }
}
