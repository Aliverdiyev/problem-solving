package operators;

public class Quiz16 {
    //    What is the output of the following application?
    public static void main(String[] args) {
        int dog = 11;
        int cat = 3;
        int partA = dog / cat;
        int partB = dog % cat;
        int newDog = partB + partA * cat;
        System.out.println(newDog);     //11
    }
}