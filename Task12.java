//Задайте два символьні масиви. Ініціалізуйте їх довільним набором елементів.
    //    Виділіть пам’ять, достатню для збереження даних масивів і заповніть її таким чином,
    //    шоб елементи другого масиву йшли за елементами першого.
   //     Виведіть результат на екран.
public class Task12 {
    public static void main(String[] args) {
        char[] array1 = {'a', 'b', 'c', 'd'};
        char[] array2 = {'e', 'f', 'g', 'h', 'i', 'j'};

        int mergedSize = array1.length + array2.length;
        char[] mergedArray = new char[mergedSize];
        System.arraycopy(array1, 0 , mergedArray, 0, array1.length);
        System.arraycopy(array2, 0 , mergedArray, array1.length, array2.length);
        for (char element: mergedArray) {
            System.out.print(element + "\t");
        }
    }
}
