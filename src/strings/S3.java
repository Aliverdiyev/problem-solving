package strings;

public class S3 {
    public static void main(String[] args) {
        String string = "   Azerbaijan Is My Country";
        System.out.println(wordCount(string) + " words.");

    }

    public static int wordCount(String string) {
        int count = 0;
        char[] ch = new char[string.length()];
        for (int i = 0; i < string.length(); i++) {
            ch[i] = string.charAt(i);
            if (i > 0 && ch[i] != ' ' && ch[i - 1] == ' ' || ch[0] != ' ' && i == 0)
                count++;
        }
        return count;
    }
}