//Напишіть клас комплексного числа. Реалізуйте методи додавання та віднімання
public class Task17 {
    public static void main(String[] args) {
    Complex_num num1 = new Complex_num(15.7f, 16.8f);
        Complex_num num2 = new Complex_num(14.6f, 13.5f);
        Complex_num adding_result = num1.add(num2);
        Complex_num subtracting_result = num1.subtract(num2);
        System.out.println("First complex number");
        num1.output();
        System.out.println("Second complex number");
        num2.output();
        System.out.println("Adding result");
        adding_result.output();
        System.out.println("Subtraction result");
        subtracting_result.output();

    }
}
class Complex_num{
     public float real;
    public float imaginary;
    public Complex_num(float param1, float param2){
        real = param1;
        imaginary = param2;
    }
    public Complex_num add (Complex_num num){
        Complex_num result = new Complex_num(0,0);
        result.real = real + num.real;
        result.imaginary = imaginary + num.imaginary;
        return result;
    }
    public Complex_num subtract (Complex_num num){
        Complex_num result = new Complex_num(0,0);
        result.real = real - num.real;
        result.imaginary = imaginary - num.imaginary;
        return result;
    }
    public void output(){
        System.out.println(real +" + " + imaginary + "i" );
    }
}