import java.util.Scanner;

public class o5_0_1Triangle {
    public static void zero_one(int n) {
        //Outer Loop
        for(int i = 1; i <= n; i++){
            //Inner Loop
            for(int j = 1; j <= i; j ++){
                // 1 or 2  Cell analyse
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                }
                else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter number : ");
        int n = sc.nextInt();
        zero_one(n);
        sc.close();
    }
}