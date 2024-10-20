import java.util.Random;
    public class Main {
        public static void main(String[] args) {
            int size = 20;
            int[] tenTaskArray = new int[size];
            Random random = new Random();
            for (int i = 0; i < size; i++) {
                tenTaskArray[i] = random.nextInt(2);
            }
            System.out.println("Рандомно созданный массив:");
            printArray(tenTaskArray);
            for (int i = 0; i < size; i++) {
                if (tenTaskArray[i] == 0) tenTaskArray[i] = 1;
                else tenTaskArray[i] = 0;
            }
            System.out.println("Отзеркаленный массив:");
            printArray(tenTaskArray);
        }

        public static void printArray(int[] tenTaskArray) {
            for (int num : tenTaskArray) System.out.print(num + " ");
            System.out.println();
        }
    }
