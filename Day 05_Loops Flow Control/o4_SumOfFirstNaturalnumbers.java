import java.util.Scanner;

public class o4_SumOfFirstNaturalnumbers {
    public static void main(String[] args) {
        Scanner user_in = new Scanner(System.in);
        System.out.print("Enter value of N : ");
        int user_input = user_in.nextInt();

        int i = 1;
        int sum = 0;
        while (i <= user_input) {
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
        user_in.close();
    }
}
