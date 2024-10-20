import java.util.Scanner;
    public class Main {
        public static void main(String[] args) {
            eightTask();j
        }
        public static void eightTask() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите строку: ");
            String userStr = scanner.nextLine();
            System.out.print("Введите число: ");
            int userNum = scanner.nextInt();
            for (int i = 0; i < userNum; i++) {
                System.out.println(userStr);
            }
        }
    }
