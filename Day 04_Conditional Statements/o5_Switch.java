import java.util.Scanner;

public class o5_Switch {
    public static void main(String[] args) {
        Scanner user_in = new Scanner(System.in);
        System.out.print("Input Between 1 - 3: ");
        int input_user = user_in.nextInt();

        switch (input_user) {
            case 1: System.out.println("One");
                break;
            case 2: System.out.println("Two");
                break;
            case 3: System.out.println("Three");
                break;
            default: System.out.println("None");
                break;
        }
        user_in.close();
    }
}
