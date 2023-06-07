//Знайдіть мінімальне значення елементу масиву з парним індексом. Кількість елементів: 20.
  //      Тип даних: float. Масив ініціалізують при його оголошенні.

public class Task6 {
    public static void main(String[] args) {
        float[] array = {2.5f, 1.3f, 4.7f, 3.2f, 6.8f, 2.1f, 5.4f, 3.9f, 1.8f, 4.6f, 3.7f, 2.9f, 5.1f, 4.3f, 2.7f, 3.6f, 1.5f, 5.9f, 2.4f, 3.8f};
       float min = array[0];
        for (int i =0; i< array.length; i+=2){
            if(array[i] < min ){
                min = array[i];
            }
        }
        System.out.println("Min value with even index = " + min);
    }
}
