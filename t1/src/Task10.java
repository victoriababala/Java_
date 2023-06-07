import java.util.ArrayList;

//Підрахуйте у довільному символьному масиві кількість голосних та приголосних.
// Розмір: 20 елементів. Регістри: верхній та нижній.
public class Task10 {
    public static void main(String[] args) {
    char[] letters = {'a', 'B', 'c', 'D', 'e', 'F', 'g', 'H', 'i', 'J', 'k', 'L', 'm', 'N', 'o', 'P', 'q', 'r', 'S', 't'};
        ArrayList<Character> vowels = new ArrayList<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('y');
       int vowel = 0,  consonant = 0;
        for (char element: letters) {
            if(vowels.contains(Character.toLowerCase(element))){
                vowel++;
            }
            else {
                consonant++;
            }
        }
        System.out.println("Vowel letters in array : " + vowel);
        System.out.println("Consonant letters in array : " + consonant);
    }
}
