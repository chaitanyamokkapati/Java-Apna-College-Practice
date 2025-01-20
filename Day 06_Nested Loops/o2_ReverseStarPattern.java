// n - i + 1
// No of Stars(n) = 4 - lines number (i) 1 + 1 Eg
import java.util.Scanner;

public class o2_ReverseStarPattern {
    public static void main(String[] args) {
        Scanner user_in = new Scanner(System.in);
        System.out.print("Enter PAttern Value: ");
        int num = user_in.nextInt();

        for(int star = 1; star <= num; star++){
            for(int line = 1; line <= num - star + 1; line++){
                System.out.print('*');
            }
            System.out.println();
        }
        user_in.close();
    }
}
