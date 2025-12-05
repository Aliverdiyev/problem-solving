package operators;

public class Quiz24 {
    //    Given the following code snippet, what are the values of the variables after it is executed?
//    (Choose all that apply.)
    public static void main(String[] args) {
        int ticketsTaken = 1;
        int ticketsSold = 3;
        ticketsSold += 1 + ticketsTaken++;
        ticketsTaken *= 2;
        ticketsSold += (long) 1;
        System.out.println(ticketsTaken + " " + ticketsSold);   //4 6
    }
}
