import Models.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Calculator addition = new Calculator(new Addition());
        Calculator subtraction = new Calculator(new Subtraction());
        Calculator multiplication = new Calculator(new Multiplication());
        Calculator division = new Calculator(new Division());

        double num1 = 10.0;
        double num2 = 5.0;

        System.out.println("Adição: " + addition.calculate(num1, num2));
        System.out.println("Subtração: " + subtraction.calculate(num1, num2));
        System.out.println("Multiplicação: " + multiplication.calculate(num1, num2));

        try {
            System.out.println("Divisão: " + division.calculate(num1, num2));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}