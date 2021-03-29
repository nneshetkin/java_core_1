package geekbrains.java_core1.lesson2;

public class HomeWork2 {


//1. Задать целочисленный массив, состоящий из элементов 0 и 1.
// Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
// С помощью цикла и условия заменить 0 на 1, 1 на 0;

    private static void invertArr() {
        int[] a1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < a1.length; i++) {
//        if (a1[i] == 0) {
//            a1[i] = 1;
//        }
//        else a1[i] =0;
            a1[i] = ~a1[i] + 2;
            System.out.print(a1[i] + " ");
        }
        System.out.println();
    }

    // 2. Задать пустой целочисленный массив размером 8.
//    С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
    private static void fillArr(int dim) {
        int[] a1 = new int[dim];
        for (int i = 0, x = 0; i < a1.length; i++, x += 3) {
            a1[i] = x;
            System.out.print(a1[i] + " ");
        }
        System.out.println();
    }

    //3.  Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти
//    по нему циклом, и числа меньшие 6 умножить на 2
    private static void changeArr() {
        int[] a2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < a2.length; i++) {
            if (a2[i] < 6) a2[i] *= 2;
            System.out.print(a2[i] + " ");
        }
        System.out.println();
    }

    //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
// и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
// Определить элементы одной из диагоналей можно
// по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
    private static void diagArr(int dim) {
        int[][] a3 = new int[dim][dim];
        for (int j = 0; j < a3.length; j++) {
            for (int i = 0; i < a3[j].length; i++) {
                if (i == j || dim == i + j + 1) {
                    a3[i][j] = 1;
                }
                System.out.print(a3[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    //5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
    private static void minMaxArr() {
        int[] a5 = {6, 4, 7, 1, 3,8,5};
        int x;
        for (int i = 0; i < a5.length; i++) {
            for (int j = i+1; j < a5.length; j++) {
                if (a5[i] > a5[j]) {
                    x = a5[i];
                    a5[i] = a5[j];
                    a5[j] = x;
                }
            }
        }
        System.out.println("Минимальный элемент= "+ a5[0]);
        System.out.println(" Максимальный элемент= "+ a5[a5.length-1]);
       }
//6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
// если в массиве есть место, в котором сумма левой и правой части массива равны.
// Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
// граница показана символами ||, эти символы в массив не входят.
    private static boolean checkBalance() {
//        int[] a5 = {1, 1, 1, 2, 1,3};
//        int sum = 0,x;
//        for (int i = 0; i < a5.length; i++) {
//            sum+=a5[i];}
//            for (int i :a5) {
//
//            }
        return false;
        }
//7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
// при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично.
// Для усложнения задачи нельзя пользоваться вспомогательными массивами.
// Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
// При каком n в какую сторону сдвиг можете выбирать сами.
   private static void biasArr(){
           }


    public static void main(String[] args) {

        invertArr();
        System.out.println("2.Задача");
        fillArr(8);
        System.out.println("3.Задача");
        changeArr();
        System.out.println("4.Задача");
        diagArr(3);
        System.out.println("5.Задача");
        minMaxArr();
    }

}
