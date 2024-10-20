public class Main {
        public static void main(String[] args) {
            int size = 100;
            int[] elevenTaskArray = new int[size];
            for (int i = 0; i < size; i++) {
                elevenTaskArray[i] = i+1;
            }
            System.out.println("Массив 1-100:");
            for (int num : elevenTaskArray) System.out.print(num + " ");
            System.out.println();
        }
    }
