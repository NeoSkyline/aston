import java.util.Random;

public class Main {
    public static void main(String[] args) {
        checkSumSign();
    }

    public static void checkSumSign() {
        Random random = new Random();
        int a = random.nextInt(21) - 10;
        int b = random.nextInt(21) - 10;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
}
