 import java.util.Scanner;

public class o3_inverted_Half_pyr_num {
    public static void inv_per_num(int n) {
        for(int i = 1; i <= n; i++){
            //Inner Loop
            for(int j = 1; j <= n - i + 1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number : ");
        int n = sc.nextInt();
        inv_per_num(n);
        sc.close();
    }
}
