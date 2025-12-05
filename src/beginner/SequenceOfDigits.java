package beginner;

/*
Write a Java program to break an 123456 into a sequence of digits
Expected output
1 2 3 4 5 6
*/
public class SequenceOfDigits {
    public static void main(String[] args) {
        int z = 123456;
        int a = z / 100000 % 10;
        int b = z / 10000 % 10;
        int c = z / 1000 % 10;
        int d = z / 100 % 10;
        int f = z / 10 % 10;
        int y = z % 10;
        System.out.println(a + " " + b + " " + c + " " + d + " " + f + " " + y);
    }
}