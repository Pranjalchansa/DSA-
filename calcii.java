import java.util.Scanner;

abstract class Calculator {
    abstract double add(double a, double b);
    abstract double subtract(double a, double b);
    abstract double multiply(double a, double b);
    abstract double divide(double a, double b);
}
class SimpleCalculator extends Calculator {
    double add(double a, double b) {
        return a + b;
    }
    double subtract(double a, double b) {
        return a - b;
    }
    double multiply(double a, double b) {
        return a * b;
    }
    double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero!");
            return 0;
        }
        return a / b;
    }
}
public class calcii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleCalculator calc = new SimpleCalculator();

        System.out.println("Enter first number:");
        double num1 = sc.nextDouble();

        System.out.println("Enter second number:");
        double num2 = sc.nextDouble();

        System.out.println("Choose operation: +, -, *, /");
        char op = sc.next().charAt(0);

        double result = 0;
        switch (op) {
            case '+': result = calc.add(num1, num2); break;
            case '-': result = calc.subtract(num1, num2); break;
            case '*': result = calc.multiply(num1, num2); break;
            case '/': result = calc.divide(num1, num2); break;
            default: System.out.println("Invalid operator!");
        }
        System.out.println("Result: " + result);
        sc.close();
    }
}
