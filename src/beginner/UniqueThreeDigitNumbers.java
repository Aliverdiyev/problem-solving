package beginner;

/*
Write a Java program to create and display a unique three-digit number using 1, 2, 3, 4. Also count how many three-digit numbers there are
Sample output:
123
124
...
431
432.
Total number of the three-digit-number is 24
 */
public class UniqueThreeDigitNumbers {
    public static void main(String[] args) {
        int count = 0;
        for (int a = 1; a <= 4; a++) {
            for (int b = 1; b <= 4; b++) {
                for (int c = 1; c <= 4; c++) {
                    if (a != b && b != c && a != c) {
                        int number = a * 100 + b * 10 + c;
                        System.out.println(number);
                        count++;
                    }
                }
            }
        }

        System.out.println("Total number of unique three-digit numbers: " + count);
    }
}