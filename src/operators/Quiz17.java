package operators;

public class Quiz17 {
    //    What is the output of the following code snippet?
    public static void main(String[] args) {
        int x = 10, y = 5;
        boolean w = true, z = false;
        x = w ? y++ : y--;
        w = !z;
        System.out.println((x + y) + " " + (w ? 5 : 10));   //11 5
    }
}