package strings;

import java.util.Scanner;

public class PasswordChecker {
    static void main(String[] args) {
        int count = 0;
        String password = "java";
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Password?");
            String entered = input.next();
            if (password.equals(entered)) // --- another sample --> (password.compareTo(entered)==0)
            {
                System.out.println("Valid password!");
                break;
            }
            count++;
        } while (count < 3); // end of do-while
        if (count >= 3)
            System.out.println("Invalid password! (your right is over)");
    }
}