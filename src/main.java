import java.util.Random; // Xастично использую для генерации случайных чисел в некоторых методах, также для генерации разного кол-ва столбцов и строк в массивах.
                        // Частично статичные числа переданы с main
public class Main {
    public static void main(String[] args) {

        printThreeWords();// 1st
        checkSumSign();  //2nd
        printColor(); //3rd
        compareNumbers(); //4th

        boolean result = fifthTask(true, false); //5th
        System.out.println(result);//5th

        sixthTask();//6th

        System.out.println(seventhTask(0));//7th

        eightTask("Hi, my name is ...", 7);//8th 

        System.out.println(nineTask(400));

        tenthTask();//10th

        evevenththTask();//11th

        twelvethTask();

        thirteenthTask();

        fourteenthTask(7, 9); 

    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign() {
        Random random = new Random();
        int a = random.nextInt(21) - 10;
        int b = random.nextInt(21) - 10;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor() { //3rd
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
    public static void compareNumbers() {//4th
        Random random = new Random();
        int a = random.nextInt(10) + 1;
        int b = random.nextInt(10) + 1;
        if (a >= b) {
            System.out.println("a >= b");
        } 
        else {
            System.out.println("a < b");
        }
    }
    public static boolean fifthTask(boolean d, boolean e) { //5th
        Random random = new Random();
        int a = random.nextInt(20) + 1;
        int b = random.nextInt(20) + 1;
        int c = a + b;
        //System.out.println(c);
        if (c >= 10 && c <= 20) return true;
        else return false;
    }
    public static void sixthTask() {
        Random random = new Random();
        int a = random.nextInt(21) - 10;
        //System.out.println(a);
        if (a >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }
    public static boolean seventhTask(int number) {
        if (number >= 0) return true;
        else return false;
    }
    
    public static void eightTask(String str, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(str);

        }
    }  
    public static boolean nineTask(int year) {
        if (year % 100 != 0 && year % 4 == 0) return true;
        else if (year % 400 == 0) return true;
        return false;
    }
    public static void tenthTask() {
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
        public static void evevenththTask() {
            int size = 100;
            int[] elevenTaskArray = new int[size];
            for (int i = 0; i < size; i++) {
                elevenTaskArray[i] = i+1;
            }
            System.out.println("Массив 1-100:");
            for (int num : elevenTaskArray) System.out.print(num + " ");
            System.out.println();
        }
        public static void twelvethTask() {
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
        public static void thirteenthTask() {
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
        public static int[] fourteenthTask(int len, int initialValue) {
            int[] thatArray = new int[len];
            for (int i = 0; i < len; i++) {
                System.out.print(thatArray[i] = initialValue);
            }
        return thatArray;
        }
}
