import java.util.Arrays;

//Впорядкуйте набір символів за алфавітом. Символи – латинські.
  //      Регістр – верхній та нижній. Кількість елементів масиву: 20.
public class Task8 {
    public static void main(String[] args) {
        char[] characters = {'z', 'X', 'a', 'D', 'b', 'Y', 'c', 'W', 'f', 'K', 'm', 'N', 'e', 'l', 'p', 'q', 'R', 'G', 'o', 'H'};

        System.out.println("Початковий набір символів:");
        printCharacters(characters);
        Arrays.sort(characters);
        System.out.println("Впорядкований набір символів:");
        printCharacters(characters);
    }
    
    public static void printCharacters(char[] characters) {
        for (int i = 0; i < characters.length; i++) {
            System.out.print(characters[i] + " ");
        }
        System.out.println();
    }
}
