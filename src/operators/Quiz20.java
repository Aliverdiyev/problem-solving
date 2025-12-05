package operators;

public class Quiz20 {
    //    What is the output of the following code snippet?
    public static void main(String[] args) {
        int pig = (short) 4;
        pig = pig++;
        long goat = (int) 2;
        goat -= 1.0;
        System.out.println(pig + " - " + goat);   //4 - 1
    }
}
