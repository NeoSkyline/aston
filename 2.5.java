import java.util.Random;

public class Main {
    public static void main(String[] args) {
        boolean result = fifthTask(true, false);
        System.out.println(result);
    }

    public static boolean fifthTask(boolean d, boolean e) {
        Random random = new Random();
        int a = random.nextInt(20) + 1;
        int b = random.nextInt(20) + 1;
        int c = a + b;
        //System.out.println(c);
        if (c >= 10 && c <= 20) return true;
        else return false;
    }
}
