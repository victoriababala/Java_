
//1. Напишіть програму для бульбашкового сортування елементів масиву.
// Парні елементи утвореного масиву скопіюйте в область пам’яті, виділену під відповідну кількість елементів.
 //       Виведіть їхні значення на екран. Розмір масиву: 10 елементів типу int. Масив ініціалізується при оголошенні.

public class Task1 {

    public static void main(String[] args) {
        int[] array = {5, 2, 8, 12, 1, 6, 4, 9, 3, 7};

        int counter = 0;
        for (int element : array) {
            if(element%2 ==0){
                counter++;
            }
        }
        int[] evenArray = new int[counter];
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        int evenIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenArray[evenIndex] = array[i];
                evenIndex++;
            }
        }
        for (int i = 0; i < evenArray.length; i++) {
            System.out.println(evenArray[i]);
        }
    }
}

