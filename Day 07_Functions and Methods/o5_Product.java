import java.util.Scanner;

public class o5_Product {
    public static int prod(int a, int b) {
        int Product = a * b;
        return Product;
    }
    public static void main(String[] args) {
        Scanner user_in = new Scanner(System.in);
        System.out.print("Pleae Enter a : ");
        int a = user_in.nextInt();
        System.out.print("Pleae Enter b : ");
        int b = user_in.nextInt();

        int ans = prod(a, b);
        //System.out.println(prod(a, b));

        System.out.println("Product of " + a + " * " + b +" = " + ans);

        user_in.close();

        // Calling Function
        ans = prod(2, 9);
        System.out.println(ans);
    }
    
}
