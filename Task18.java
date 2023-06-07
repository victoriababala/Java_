//Задайте масив із 20 чисел. Знайдіть максимальний елемент з парним індексом.
public class Task18 {
    public static void main(String[] args) {
        int[] array = {4, 7, 12, 34, 56, 6, 45, 78, 123, 5, 45, -2, 3, 4, 7, 67, 45, 234, 12, 3};
        System.out.println("Max element with even index = " + find_max_even(array));
    }
    public static int  find_max_even(int[] arr){
        int max_element = Integer.MIN_VALUE;
        for (int i =0; i < arr.length; i+=2){
            if(arr[i] > max_element){
                max_element = arr[i];
            }
        }
        return max_element;
    }
}
