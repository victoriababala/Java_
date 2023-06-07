import java.util.ArrayList;
import java.util.Arrays;

//Задайте символьний масив, що складається з 20 елементів. Ініціалізуйте його.
       // Переставте елементи таким чином, щоб на початку утворилася послідовність з голосних,
// причому таким чином, щоб голосні літери були розташовані за алфавітом. Елементи, значення яких повторюються, повинні знаходитися поруч.
public class Task15 {
    public static void main(String[] args) {
        char[] array = {'e', 'a', 'u', 'i', 'o', 'a', 'e', 'i', 'o', 'u', 'a', 'o', 'e', 'i', 'u', 'a', 'o', 'e', 'i', 'u'};

        System.out.println("Початковий масив: " + Arrays.toString(array));

        char[] sortedArray = Arrays.copyOf(array, array.length);

        Arrays.sort(sortedArray);

        int vowelIndex = 0;
        for (int i = 0; i < sortedArray.length; i++) {
            if (isVowel(sortedArray[i])) {
                swap(sortedArray, i, vowelIndex);
                vowelIndex++;
            }
        }

        System.out.println("Відсортований масив: " + Arrays.toString(sortedArray));
    }

    public static boolean isVowel(char c) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for (char vowel : vowels) {
            if (Character.toLowerCase(c) == vowel) {
                return true;
            }
        }
        return false;
    }
    public static void swap(char[] array, int i, int j) {
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
