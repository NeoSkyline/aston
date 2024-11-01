public class Main {
    public static void main(String[] args) {
        printThreeWords();// 1st
        checkSumSign();  //2nd
        printColor(); //3rd
        compareNumbers(); //4th
        System.out.println(fifthTask(8, 17));//5
        System.out.println();//5
        sixthTask(7);//6th
        System.out.println();
        System.out.println(seventhTask(0));//7th
        eightTask("Hi, my name is ...", 7);//8th 
        System.out.println(nineTask(400));
        tenthTask();//10th
        evevenththTask();//11th
        twelvethTask();
        thirteenthTask();
        fourteenthTask(7, 9); 
    }
    public static void printThreeWords() {//1st
        System.out.println("Orange\n" + "Banana\n" + "Apple");
    }
    public static void checkSumSign() { //2nd
        int a = 5;
        int b = 8;
        int c = a + b;
        if (c >= 0) System.out.println("Сумма положительная");
        else System.out.println("Сумма отрицательная");
    }
    public static void printColor() { //3rd
        int value = -5;
        if (value <= 0) System.out.println("Красный");
        else if (value >= 1 && value <= 100) System.out.println(":Желтый");
        else if (value >= 101) System.out.println("Зеленый");
    }
    public static void compareNumbers() {//4th
        int a = 5;
        int b = 9;
        if (a >= b) System.out.println("a >= b");
        else System.out.println("a < b");
    }
    public static boolean fifthTask(int a, int b) { //5th
        int c = a + b;
        if (c >= 10 && c <= 20) return true;
        else return false;
    }
    public static void sixthTask(int a) {//6th
        if (a >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }
    public static boolean seventhTask(int number) {//7th
        if (number >= 0) return false;
        else return true;
    }
    public static void eightTask(String str, int a) {//8th
        for (int i = 0; i < a; i++) {
            System.out.println(str);
        }
    }  
    public static boolean nineTask(int year) {//9th
        if (year % 100 != 0 && year % 4 == 0) return true;
        else if (year % 400 == 0) return true;
        return false;
    }
    public static void tenthTask() {//10th
        int[] tenTaskArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Массив из задания:");
        printArray(tenTaskArray);
        for (int i = 0; i < tenTaskArray.length; i++) {
            if (tenTaskArray[i] == 0) tenTaskArray[i] = 1;
            else tenTaskArray[i] = 0;
        }
        System.out.println("Отзеркаленный массив:");
        printArray(tenTaskArray);
    }
    public static void printArray(int[] array) {
        for (int num : array) System.out.print(num + " "); 
        System.out.println();
    }
    public static void evevenththTask() {//11th
        int size = 100;
        int[] elevenTaskArray = new int[size];
        for (int i = 0; i < size; i++) elevenTaskArray[i] = i+1;
        System.out.println("Массив 1-100:");
        printArray(elevenTaskArray);
    }
    public static void twelvethTask() {//12th
        int[] twelweArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < twelweArray.length; i++) {
            if (twelweArray[i] < 6) twelweArray[i] *= 2;
        }
        System.out.println("Массив:");
        printArray(twelweArray);
    }
    public static void thirteenthTask() {//13
        int a = 5;
        int[][] array = new int[a][a];
        showThisArray(array);
        for (int i = 0; i < a; i++) array[i][i] = 1; 
        showThisArray(array);
        for (int i = 0; i < a; i++) array[i][a - 1 - i] = 1; 
        showThisArray(array);
    }
    public static void showThisArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array[i].length; k++) System.out.print(array[i][k] + " ");
            System.out.println();
        }
        System.out.println();
    }
    public static int[] fourteenthTask(int len, int initialValue) {
        int[] thatArray = new int[len];
        for (int i = 0; i < len; i++) System.out.print(thatArray[i] = initialValue);
        return thatArray;
    }
}
