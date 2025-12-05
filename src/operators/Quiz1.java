package operators;

public class Quiz1 {
    //      What is the output of the following application?
    public static void main(String[] args) {
        boolean carrot = true;
        boolean potato = false;
        boolean broccoli = true;
        carrot = carrot & potato;
        broccoli = broccoli ? !carrot : potato;
        potato = !broccoli ^ carrot;
        System.out.println(carrot + "," + potato + "," + broccoli); //false  false  true
    }
}