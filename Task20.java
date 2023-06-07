import java.util.Random;

// Напишіть клас матриці. Розмір задайте за допомогою конструктора. Реалізуйте методи додавання та віднімання
public class Task20 {
    public static void main(String[] args) {
        System.out.println("Array №1");
        System.out.println("_________________________________");
        Matrix m1 = new Matrix(4,4);
        m1.printArray();
        System.out.println("_________________________________");
        System.out.println();
        System.out.println("Array №2");
        System.out.println("_________________________________");
        Matrix m2 = new Matrix(4,4);
        m2.printArray();
        System.out.println("_________________________________");
        System.out.println("Adding result");
        System.out.println("_________________________________");
        Matrix adding_result = m1.add(m2);
        adding_result.printArray();
        System.out.println("_________________________________");
        System.out.println("Subtracting result");
        System.out.println("_________________________________");
        Matrix subtracting_result = m1.substract(m2);
        subtracting_result.printArray();
        System.out.println("_________________________________");
    }
}
class Matrix{
    private int row_size;
    private int column_size;
    private int[][] matrix;

    public int getColumn_size() {
        return column_size;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public int getRow_size() {
        return row_size;
    }
    public Matrix(int x, int y){
        Random random = new Random();
      row_size = x;
      column_size = y;
        matrix = new int[x][y];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(1,50);
            }
        }
  }
    public  void printArray() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
  public Matrix add (Matrix arr){
      Matrix result = new Matrix(row_size,column_size);
      if(arr.getRow_size() != row_size || arr.getColumn_size() != column_size){
          System.out.println("Ці матриці не можна додати, оскільки кількість рядків та стовпців в матриць  відрізняються");
      }
      else {
            for (int i =0; i < arr.getRow_size(); i++){
                for (int j =0; j < arr.getColumn_size(); j++){
                        result.matrix[i][j] = matrix[i][j] + arr.matrix[i][j];
                }
            }
      }

      return result;
  }
    public Matrix substract (Matrix arr){
        Matrix result = new Matrix(row_size,column_size);
        if(arr.getRow_size() != row_size || arr.getColumn_size() != column_size){
            System.out.println("Ці матриці не можна відняти, оскільки кількість рядків та стовпців в матриць  відрізняються");
        }
        else {
            for (int i =0; i < arr.getRow_size(); i++){
                for (int j =0; j < arr.getColumn_size(); j++){
                    result.matrix[i][j] = matrix[i][j] - arr.matrix[i][j];
                }
            }
        }

        return result;
    }
}