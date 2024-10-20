 public class Main {
        public static void main(String[] args) {
            int[] twelweArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            for (int i = 0; i < twelweArray.length; i++) {
                if (twelweArray[i] < 6) {
                    twelweArray[i] *= 2;
                }
            }
            System.out.println("Массив:");
            for (int num : twelweArray) System.out.print(num + " ");
            System.out.println();
        }
    }
