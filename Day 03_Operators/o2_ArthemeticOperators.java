// Arthemetic Operators
// 1. Binary Operators
// 2. Unary Operators
public class o2_ArthemeticOperators {
    public static void main(String[] args) {
        // Binary Operators
        int num1 = 10, num2 = 5;
        int result;

        // Addition (+)
        result = num1 + num2;
        System.out.println("Addition: " + result);

        // Subtraction (-)
        result = num1 - num2;
        System.out.println("Subtraction: " + result);

        // Multiplication (*)
        result = num1 * num2;
        System.out.println("Multiplication: " + result);

        // Division (/)
        result = num1 / num2;
        System.out.println("Division: " + result);

        // Modulus (%)
        result = num1 % num2;
        System.out.println("Modulus: " + result);

        // Unary Operators
        int num3 = 5;

        // Unary plus (+)
        System.out.println("Unary plus: " + (+num3)); // Same as num3

        // Unary minus (-)
        System.out.println("Unary minus: " + (-num3)); // Negates num3

        // Increment (++)
        System.out.println("Increment: " + (++num3)); // Increases num3 by 1, num3 becomes 6

        // Decrement (--)
        System.out.println("Decrement: " + (--num3)); // Decreases num3 by 1, num3 becomes 5 again

        // Logical NOT (!)
        boolean flag = true;
        System.out.println("Logical NOT: " + !flag); // Flips the boolean value, prints 'false'
    }
}
