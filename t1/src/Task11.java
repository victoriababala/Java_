// Задайте 2 масиви типу int розміром 4х4.
      //  Ініціалізуйте елементи довільними значеннями (елементи другого масиву не можуть бути рівними 0).
      //  Поділіть елементи першого масиву на елементи другого масиву з відповідними індексами.
     //   Результат запишіть у виділену область пам’яті. Виведіть на екран дані у вигляді таблички
public class Task11 {
    public static void main(String[] args) {
        int[][] array1 = {
                {2, 3, 4, 5},
                {6, 7, 8, 9},
                {10, 11, 12, 13},
                {14, 15, 16, 17}
        };

        int[][] array2 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int[][] result = new int[4][4];

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                if (array2[i][j] != 0) {
                    result[i][j] = array1[i][j] / array2[i][j];
                } else {
                    System.out.println("Помилка: елемент другого масиву рівний нулю.");
                    return;
                }
            }
        }

        System.out.println("Результат ділення елементів першого масиву на елементи другого масиву:");
        printArray(result);
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
