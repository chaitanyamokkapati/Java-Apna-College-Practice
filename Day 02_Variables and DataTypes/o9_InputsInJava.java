/*
next
nextLine
nextlnt
nextByte
nextFloat
nextDouble
nextBoolean
nextShort
nextLong
*/

import java.util.Scanner;

public class o9_InputsInJava {
    public static void main(String[] args) {
        // Create a Scanner object to read from the keyboard
        Scanner sc = new Scanner(System.in);

        // Reading a String (single word)
        System.out.print("Enter a word: ");
        String word = sc.next();
        System.out.println("You entered (word): " + word);

        // Consume the newline character left by next()
        sc.nextLine(); // To ensure the nextLine() works properly

        // Reading a full line of input (with spaces)
        System.out.print("Enter a full sentence: ");
        String sentence = sc.nextLine();
        System.out.println("You entered (sentence): " + sentence);

        // Reading an integer
        System.out.print("Enter an integer: ");
        int intValue = sc.nextInt();
        System.out.println("You entered (integer): " + intValue);

        // Reading a byte
        System.out.print("Enter a byte value: ");
        byte byteValue = sc.nextByte();
        System.out.println("You entered (byte): " + byteValue);

        // Reading a float
        System.out.print("Enter a float value: ");
        float floatValue = sc.nextFloat();
        System.out.println("You entered (float): " + floatValue);

        // Reading a double
        System.out.print("Enter a double value: ");
        double doubleValue = sc.nextDouble();
        System.out.println("You entered (double): " + doubleValue);

        // Reading a boolean
        System.out.print("Enter a boolean value (true/false): ");
        boolean booleanValue = sc.nextBoolean();
        System.out.println("You entered (boolean): " + booleanValue);

        // Reading a short
        System.out.print("Enter a short value: ");
        short shortValue = sc.nextShort();
        System.out.println("You entered (short): " + shortValue);

        // Reading a long
        System.out.print("Enter a long value: ");
        long longValue = sc.nextLong();
        System.out.println("You entered (long): " + longValue);

        // Close the scanner
        sc.close();
    }
}
