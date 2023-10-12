public class ArithmeticOperatorsExample {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        // Addition
        int sum = a + b;
        System.out.println("Sum: " + sum);

        // Subtraction
        int difference = a - b;
        System.out.println("Difference: " + difference);

        // Multiplication
        int product = a * b;
        System.out.println("Product: " + product);

        // Division
        int quotient = a / b;
        System.out.println("Quotient: " + quotient);

        // Modulus
        int remainder = a % b;
        System.out.println("Remainder: " + remainder);

        // Increment and Decrement
        a++; // a = a + 1;
        b--; // b = b - 1;
        System.out.println("After incrementing a: " + a);
        System.out.println("After decrementing b: " + b);

        // Unary Plus and Unary Minus
        int positiveValue = +a;
        int negativeValue = -b;
        System.out.println("Positive Value of a: " + positiveValue);
        System.out.println("Negative Value of b: " + negativeValue);


    }
}
