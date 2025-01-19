import java.util.Scanner;

public class o6_calculator {
    public static void main(String[] args) {
        Scanner User_input = new Scanner(System.in);
        System.out.print("Please Enter a : ");
        int a = User_input.nextInt();
        System.out.print("Please Enter b : ");
        int b = User_input.nextInt();
        System.out.print("Please Enter Symbol : ");
        char user_symbol = User_input.next().charAt(0);

        switch (user_symbol) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
            System.out.println(a - b);
            break;
            case '*':
            System.out.println(a * b);
            break;
            case '/':
            System.out.println(a / b);
            break;
            case '%':
            System.out.println(a % b);
            break;
        
            default:
            System.out.println("Invalid Symbol!!");
                break;
        }
    }
    }