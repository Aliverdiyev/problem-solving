package strings;


// Write a program that finds the number of times a particular character occurs in a text

public class CharacterCount {
    static void main() {

//  1.
        String m = "hello";
        char someChar = 'l';
        int count = 0;
        for (int i = 0; i < m.length(); i++) {
            if (m.charAt(i) == someChar) {
                count++;
            }
        }
        System.out.println(count);

//  2.
        String text = "This is a sample text to find character count";
        char characterToFind = 't';
        int count1 = 0;
        for (char character : text.toCharArray()) {
            if (character == characterToFind) {
                count1++;
            }
        }
        System.out.println("The character '" + characterToFind + "' appears " + count1 + " times in the text.");
    }
}