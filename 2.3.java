import java.util.Random;

public class Main {
    public static void main(String[] args) {
        printColor();
    }

    public static void printColor() {
        Random random = new Random();
        int value = random.nextInt(301) - 150;

        if (value <= 0) {
            System.out.println("Красный");
        } 
        else if (value >= 1 && value <= 100) {
            System.out.println(":Желтый");
        } 
        else if (value >= 101) {
            System.out.println("Зеленый");
        }
    }
}
