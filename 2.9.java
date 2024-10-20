import java.util.Scanner;
    public class Main {
        public static void main(String[] args) {
            boolean result = nineTask(true, false);
            System.out.println(result);
        }
        public static boolean nineTask(boolean d, boolean e) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите год: ");
            int userNum = scanner.nextInt();
            if (userNum % 100 != 0 && userNum % 4 == 0) return d;
            else if (userNum % 400 == 0) return d;
            return e;
        }
    }
