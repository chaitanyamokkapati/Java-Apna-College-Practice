/*
        ==: Checks if two values are equal.
        !=: Checks if two values are not equal.
        >: Checks if the left value is greater than the right value.
        <: Checks if the left value is less than the right value.
        >=: Checks if the left value is greater than or equal to the right value.
        <=: Checks if the left value is less than or equal to the right value.
*/
public class o4_RelationalOperators {
    public static void main(String[] args) {
        int a = 10, b = 20;

        System.out.println("a == b: " + (a == b));  // false
        System.out.println("a != b: " + (a != b));  // true
        System.out.println("a > b: " + (a > b));    // false
        System.out.println("a < b: " + (a < b));    // true
        System.out.println("a >= b: " + (a >= b));  // false
        System.out.println("a <= b: " + (a <= b));  // true
    }
}
