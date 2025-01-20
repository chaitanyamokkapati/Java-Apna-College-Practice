import java.util.Scanner;

public class o3_parameterAdd {
    public static void cal_sum(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("The Sum of : "+num1+" + "+num2 +" = "+ sum);
    }
    public static void main(String[] args) {
        Scanner num_add = new Scanner(System.in);
        System.out.print("Please Enter a: ");
        int a = num_add.nextInt();
        System.out.print("Please Enter b: ");
        int b = num_add.nextInt();
        cal_sum(a, b);
        num_add.close();
    }
}
