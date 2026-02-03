import java.util.Scanner;

abstract class Calculator {
    abstract int calculate(int a, int b);
}

class Add extends Calculator {
    int calculate(int a, int b) {
        return a + b;
    }
}

class Subtract extends Calculator {
    int calculate(int a, int b) {
        return a - b;
    }
}

class Multiply extends Calculator {
    int calculate(int a, int b) {
        return a * b;
    }
}

class Divide extends Calculator {
    int calculate(int a, int b) {
        return a / b;
    }
}

public class homeworkcalc {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");

        int choice = sc.nextInt();

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        Calculator c = null;

        if (choice == 1)
            c = new Add();
        else if (choice == 2)
            c = new Subtract();
        else if (choice == 3)
            c = new Multiply();
        else if (choice == 4)
            c = new Divide();
        else {
            System.out.println("Invalid choice");
            return;
        }

        int result = c.calculate(a, b);
        System.out.println("Result = " + result);
    }
}