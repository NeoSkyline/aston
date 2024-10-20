import java.util.Random;
 
public class Main {
    public static void main(String[] args) {
        boolean result = seventhTask(true, false);
        System.out.println(result);
    }

    public static boolean seventhTask(boolean d, boolean e) {
        Random random = new Random();
        int a = random.nextInt(21) - 10;
        //System.out.println(a);
        if (a >= 0) return true;
        else return false;
        }
    }
