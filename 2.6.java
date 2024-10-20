import java.util.Random;
 
public class Main {
    public static void main(String[] args) {
        sixthTask();
    }

    public static void sixthTask() {
        Random random = new Random();
        int a = random.nextInt(21) - 10;
        //System.out.println(a);
        if (a >= 0) {
            System.out.println("posi Положительное число");
        } else {
            System.out.println("nega Отрицательное число");
        }
    }
}
