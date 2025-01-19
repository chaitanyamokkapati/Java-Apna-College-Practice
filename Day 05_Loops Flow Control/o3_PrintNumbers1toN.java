import java.util.Scanner;

public class o3_PrintNumbers1toN {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        System.out.print("Enter End number to count: ");
        int user_in = user_input.nextInt();
        int i = 1;

        while (i <= user_in) {
            System.out.println(i);
            i++;
            user_input.close();
        }
    }
}
