import java.lang.reflect.Array;
import java.util.Arrays;

//Задайте випадковий набір чисел типу int з 10 елементів.
    //    Виділіть пам’ять для аналогічної кількості даних.
    //    Скопіюйте дані з першого масиву у другий. Перший впорядкуйте за зростанням, другий – за спаданням.
     //   Скопіюйте перші 5 елементів першого масиву у другий. Виведіть результат на екран.
public class Task5 {
    public static void main(String[] args) {
        int[] arr1 = {7, 5, 32, 45, 6, 28, 12, 3, 98, 8};
        int[] arr2 = new int[10];
        System.arraycopy(arr1, 0, arr2, 0, arr2.length);
        System.out.println("Array 1:");
        output_array(arr1);
        System.out.println();
        System.out.println("Array 2:");
        output_array(arr2);
        System.out.println();
        Sorting(arr1, true);
        Sorting(arr2, false);
        for (int i =0; i <5; i++){
            arr2[i] = arr1[i];
        }
        System.out.println("Array 1 after sorting:");
        output_array(arr1);
        System.out.println();
        System.out.println("Array 2 after sorting backwards with first 5 elements of first array:");
        output_array(arr2);
    }

    public static void output_array(int[] arr){
        for (int element: arr) {
            System.out.print(element +" ");
        }
        System.out.println();
    }
    public static  void Sorting(int[] arr, boolean type){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(type == true){
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
               else{
                    if (arr[j] < arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }
        /*for (int element: arr) {
            System.out.print(element +" ");
        }
        System.out.println();*/
    }
}

