import java.util.ArrayList;

//Задайте символьний масив, який складається з літер латинського алфавіту.
   //     Розмір: 20 елементів. Виведіть на екран літери, що позначають приголосні.
public class Task9 {
    public static void main(String[] args) {
        char[] characters = {'c', 'B', 'a', 'D', 'F', 'e', 'A', 'g', 'H', 'b', 'E', 'd', 'C', 'h', 'G', 'f', 'I', 'i', 'J', 'j'};
        ArrayList<Character> letters = new ArrayList<>();
        letters.add('a');
        letters.add('e');
        letters.add('i');
        letters.add('o');
        letters.add('u');
        letters.add('y');
        for (char element: characters) {
            if(!letters.contains(Character.toLowerCase(element))){
                System.out.print(element + " ");
            }
        }
    }
}
