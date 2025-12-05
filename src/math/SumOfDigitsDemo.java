package math;

public class SumOfDigitsDemo {
    public static void main(String[] args) {
        int n = 12345;
        int sum = 0;
        while (n > 0) {
            int l = n % 10;
            n /= 10;
            sum += l;
            System.out.println(l);
        }
        System.out.println(sum);
    }
}