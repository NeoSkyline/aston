import java.util.Random;

    public class Main {
        public static void main(String[] args) {
            Random random = new Random();
            int a = random.nextInt(5) + 1;
            int[][] array = new int[a][a];
            showThisArray(array);
            for (int i = 0; i < a; i++) {
                array[i][i] = 1; 
            }
            showThisArray(array);
            for (int i = 0; i < a; i++) {
                array[i][a - 1 - i] = 1; 
            }
            showThisArray(array);
        }
        public static void showThisArray(int[][] array) {
            for (int i = 0; i < array.length; i++) {
                for (int k = 0; k < array[i].length; k++) {
                    System.out.print(array[i][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
