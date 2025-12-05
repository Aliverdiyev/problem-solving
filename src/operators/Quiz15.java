package operators;

public class Quiz15 {
    //    What is the output of the following application?
    public static void main(String[] args) {
        int tiger = 2;
        short lion = 3;
        long winner = lion + 2 * (tiger + lion);
        System.out.print(winner);   //13
    }
}
