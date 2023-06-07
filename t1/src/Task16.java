import java.util.Scanner;

//Напишіть програму, яка очікуватиме введення з клавіатури довільного цілого числа у діапазоні від 1 до 26,
   //     яке позначатиме порядковий номер літери латинського алфавіту.
   //     Виведіть на екран послідовність літер починаючи з «a» і закінчуючи літерою, номер якої введено.
public class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть номер літери (1-26): ");
        int number = scanner.nextInt();

        if (number < 1 || number > 26) {
            System.out.println("Некоректне введення. Номер має бути у діапазоні від 1 до 26.");
        } else {
            int asciiValue = 'a' + number - 1;

            System.out.print("Послідовність літер: ");
            for (int i = 'a'; i <= asciiValue; i++) {
                System.out.print((char) i + " ");
            }
        }
    }
}
