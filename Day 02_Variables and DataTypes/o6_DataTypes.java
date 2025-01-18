// Data Types in JAVA
// 1. Primitive Datatypes   2. Non-Primitive data types
/*
    byte (8-bit)
    short (16-bit)
    int (32-bit)
    long (64-bit)
    float (32-bit, single precision)
    double (64-bit, double precision)
    char (16-bit, used for characters)
    boolean (true/false)
*/
public class o6_DataTypes {
    public static void main(String[] args) {
        // Primitive Data Types
        
        // 1. byte (8-bit, range: -128 to 127)
        byte b = 8;
        System.out.println("Byte value: " + b);

        // 2. short (16-bit, range: -32,768 to 32,767)
        short sh = 120;
        System.out.println("Short value: " + sh);

        // 3. int (32-bit, range: -2^31 to 2^31-1)
        int num = 100;
        System.out.println("Int value: " + num);

        // 4. long (64-bit, range: -2^63 to 2^63-1)
        long l = 10000000000L; // Use 'L' suffix for long literals
        System.out.println("Long value: " + l);

        // 5. float (32-bit, single precision, use 'f' suffix)
        float price = 16.5f;
        System.out.println("Float value: " + price);

        // 6. double (64-bit, double precision)
        double d = 3.14159;
        System.out.println("Double value: " + d);

        // 7. char (16-bit, represents a single Unicode character)
        char ch = 'a';
        System.out.println("Char value: " + ch);

        // 8. boolean (true/false)
        boolean isJavaFun = true;
        System.out.println("Boolean value: " + isJavaFun);
    }

    }