import java.util.Random;

    public class Main {
        public static void main(String[] args) {
            Random random = new Random();
            int a = random.nextInt(5) + 1;
            int b = random.nextInt(10) + 1;
            System.out.println(a + " " + b);          
            int[] thatArray = createThatArray(a, b);
            showArray(thatArray);
        }
        public static int[] createThatArray(int len, int initialValue) {
            int[] array = new int[len];
            for (int i = 0; i < len; i++) {
                array[i] = initialValue;
            }
            return array;
        }
        public static void showArray(int[] array) {
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

// Все задания строил с использованием рандома для генерации уникальных вводных аргументов каждый раз с целью показать что все работает с разными вводными
