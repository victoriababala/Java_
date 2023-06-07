//Задайте масив розміром 5х5 типу int. Ініціалізуйте його довільними елементами.
    // Впорядкуйте елементи масиву таким чином, щоб на його головній діагоналі знаходилися елементи:
// з індексом (0,0) – мінімальний, (4,4) – максимальний.
    // Дозволяється переставляти тільки ті елементи, розташування яких буде змінено. Інші – повинні залишитися на своїх місцях.
public class Task14 {
    public static void main(String[] args) {
        int[][] array = {
                {4, 7, 12, 34, 56},
                {6, 45, 78, 123, 5},
                {45, -2, 3, 4, 7},
                {67, 45, 234, 12, 3},
                {890, 345, 1, 2, 3},};
        System.out.println("Start array");
        System.out.println("_____________________________________");
        output(array);
        System.out.println("_____________________________________");
        System.out.println();
        int min_row_index = 0;
        int min_column_index = 0;
        int min_element = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] < min_element) {
                    min_row_index = i;
                    min_column_index = j;
                    min_element = array[i][j];
                }
            }
        }
        int max_row_index = 0;
        int max_column_index = 0;
        int max_element = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] > max_element) {
                    max_row_index = i;
                    max_column_index = j;
                    max_element = array[i][j];
                }
            }
        }
            int temp = array[0][0];
            array[0][0] = array[min_row_index][min_column_index];
            array[min_row_index][min_column_index] = temp;
            temp = array[4][4];
            array[4][4] =  array[max_row_index][max_column_index];
            array[max_row_index][max_column_index] = temp;
        System.out.println("Array after replacing");
        System.out.println("_____________________________________");
        output(array);
        System.out.println("_____________________________________");
    }
    public static void output(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
