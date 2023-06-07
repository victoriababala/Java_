 // Задайте масив розміром 5х5 типу int. Ініціалізуйте його довільними елементами.
      //  Переставте місцями елементи його діагоналей. Виведіть на екран початковий стан та наступний.
public class Task13 {
    public static void main(String[] args) {
        int[][] array = {
                {4, 7, 12, 34, 56},
                {6, 45, 78, 12, 5},
                {45, 2, 3, 4, 7},
                {67, 45, 23, 12, 3},
                {89, 34, 1, 2, 3},};
        System.out.println("Start array");
        System.out.println("_____________________________________");
        output(array);
        System.out.println("_____________________________________");
        System.out.println();
        for (int i =0 ; i < array.length; i++){
            int temp = array[i][i];
            array[i][i] = array[i][array.length -1 - i];
            array[i][array.length -1 - i] = temp;
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
}
