import java.util.Random;

public class Main {
    public static void main(String[] args) {
        compareNumbers();
    }

    public static void compareNumbers() {
        Random random = new Random();
        int a = random.nextInt(10) + 1;
        int b = random.nextInt(10) + 1;
        if (a >= b) {
            System.out.println("a >= b");
        } 
        else {
            System.out.println("a < b");
        }
    }
}