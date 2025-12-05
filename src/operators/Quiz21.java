package operators;

public class Quiz21 {
    //    What are the unique outputs of the following code snippet? (Choose all that apply.)
    public static void main(String[] args) {
        short height = 1, weight = 3;
//        short zebra = (byte) weight * (byte) height;
        double ox = 1 + height * 2 + weight;
        long giraffe = 1 + 9 % height + 1;
//        System.out.println(zebra);      //error The code does not compile.
        System.out.println(ox);     //6
        System.out.println(giraffe);    //2
    }
}
