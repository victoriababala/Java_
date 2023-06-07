/*Впорядкуйте елементи масиву таким чином, щоб парні значення чергувалися з непарними.
        Кількість елементів масиву: 20. Масив ініціалізується при оголошенні.*/

public class Task3 {
    public static void main(String[] args) {
        int array[] = {5, 2, 8, 12, 1, 6, 4, 9, 3, 7, 10, 15, 13, 11, 16, 19, 18, 20, 17, 14};
        int evenIndex = 0;
        int oddIndex = 1;

        while (evenIndex < array.length && oddIndex < array.length) {
            while (evenIndex < array.length && array[evenIndex] % 2 == 0) {
                evenIndex += 2;
            }

            while (oddIndex < array.length && array[oddIndex] % 2 != 0) {
                oddIndex += 2;
            }

            if (evenIndex < array.length && oddIndex < array.length) {
                int temp = array[evenIndex];
                array[evenIndex] = array[oddIndex];
                array[oddIndex] = temp;
            }
        }

        // Виведення впорядкованого масиву на екран
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

