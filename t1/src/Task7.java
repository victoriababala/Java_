import java.util.Arrays;

//Створіть масив розміром 5х5. Ініціалізуйте його довільними цілими числами при оголошенні.
    //    У кожному рядкові знайдіть максимальне значення і помістіть його на головну діагональ матриці,
   //     що представлена цим масивом.
    //    Виведіть на екран початковий стан елементів та утворений.
public class Task7 {
    public static void main(String[] args) {
        int[][] array = {{4, 7, 12, 34, 56},
                {6, 45, 78, 123, 5},
                {45, 2, 3, 4, 7},
                {67, 45, 234, 12, 3},
                {890, 345, 1, 2, 3},};
        System.out.println("Start array");
        System.out.println("_____________________________________");
        output(array);
        System.out.println("_____________________________________");
        System.out.println();
        for (int i = 0; i < array.length; i++){
            int max_index_row1 = Max_index(array[i]);
            int temp = array[i][i];
             array[i][i] = array[i][max_index_row1];
            array[i][max_index_row1] = temp;
        }
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
    public static int Max_index (int[] arr ){
        int max_index = 0;
        int max_element = 0;
        for (int i =0; i< arr.length; i++){
            if(arr[i] > max_element ){
                max_index = i;
                max_element = arr[i];
            }
        }
        return max_index;
    }
}
