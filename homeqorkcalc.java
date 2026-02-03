import java.util.Scanner;

abstract class Calculator {
    abstract void add(int a, int b);
    abstract void subtract(int a, int b);
    abstract void multiply(int a, int b);
    abstract void divide(int a, int b);
}

class MyCalculator extends Calculator {

    void add(int a, int b) {
        System.out.println("Addition = " + (a + b));
    }

    void subtract(int a, int b) {
        System.out.println("Subtraction = " + (a - b));
    }

    void multiply(int a, int b) {
        System.out.println("Multiplication = " + (a * b));
    }

    void divide(int a, int b) {
        if (b != 0)
            System.out.println("Division = " + (a / b));
        else
            System.out.println("Cannot divide by zero");
    }
}

public class homeqorkcalc {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        Calculator c = new MyCalculator();

        c.add(a, b);
        c.subtract(a, b);
        c.multiply(a, b);
        c.divide(a, b);
    }
}
