import java.util.Scanner;

public class o8_isPrime {
    public static boolean is_prime(int n) {
        boolean is_prime = true;
        for(int i = 2; i <= n-1; i++){
            if (n % 2 == 0) {
                is_prime = false;
                break;
            }
        }
        return is_prime;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pleae Enter n : ");
        int n = sc.nextInt();
        System.out.println(is_prime(n));
        sc.close();
    }
}
