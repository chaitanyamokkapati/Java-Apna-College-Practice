import java.util.Scanner;

public class o4_Swap {
    public static void Swap(int a, int b) {
        // Swap
        int c = a;
        a = b;
        b = c;
        System.out.println("a : " + a); // This is different from main() -> Function
        System.out.println("b : " + b); // This is different from main() -> Function
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a : ");
        int a = sc.nextInt();
        
        System.out.print("Enter value of b : ");
        int b = sc.nextInt();

        System.out.println("Original a : " + a); // This is different from Swap() -> Function
        System.out.println("Original b : " + b); // This is different from Swap() -> Function

        // Call By Value
        Swap(a, b); // Function Call

        sc.close();
    }
}
