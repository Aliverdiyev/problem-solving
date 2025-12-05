package strings;

// Reverse a string by preserving word position

public class StringReverse {
//    public static String reverseWordsMethod1(String s) {
//        char[] chars = s.toCharArray();
//        int start = 0;
//        int end = chars.length - 1;
//        while (start < end) {
//            char temp = chars[start];
//            chars[start] = chars[end];
//            chars[end] = temp;
//            start++;
//            end--;
//        }
//
//        return String.valueOf(chars);
//    }

    public static String reverseWordsMethod2(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(new StringBuilder(word).reverse()).append(" ");
        }
        return result.toString().trim();
    }

    static void main() {
//        System.out.println(reverseWordsMethod1("Hello World"));
        System.out.println(reverseWordsMethod2("Hello World"));
    }
}