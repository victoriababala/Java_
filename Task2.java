//Задано 2 масиви типу int.
    //    Необхідно виділити пам’ять під сумарну кількість елементів
    //    цих масивів і почергово скопіювати елементи цих масивів за новою адресою.
    //    Кількість елементів, які копіюють за 1 раз – 1. Кількість елементів кожного масиву: 10. Результат вивести на екран.
public class Task2 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] array2 = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        int totalLength = array1.length + array2.length;
        int[] newArray = new int[totalLength];
        int newindex = 0;
        for (int i = 0; i < array1.length; i++){
            newArray[newindex] = array1[i];
            newindex++;
        }
        for(int i = 0; i < array2.length; i++){
            newArray[newindex] = array2[i];
            newindex++;
        }
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
        }
    }


