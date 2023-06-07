import java.util.Scanner;

// Ініціалізуйте масив при його оголошенні 10 елементами. Виділіть пам’ять для 11 елементів.
      //  На основі першого масиву створіть новий.
      //  Значення одинадцятого елементу введіть з клавіатури
public class Task4 {
    public static void main(String[] args) {
        int[] array1 = {5, 2, 8, 12, 1, 6, 4, 9, 3, 7};
        int[] array2 = new int[11];
       System.arraycopy(array1,0,array2,0,array1.length);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть значення 11-го елементу: ");
        int value = scanner.nextInt();
        array2[10] = value;
        for (int element: array2) {
            System.out.print(element + " ");
        }
    }


}
