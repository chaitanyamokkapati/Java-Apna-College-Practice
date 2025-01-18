// Area of Circle

import java.util.Scanner;

public class o12_AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Input Radius: ");
        float radius = sc.nextFloat();
        float area = 3.14f * radius * radius;
        System.out.println(area);
        sc.close();
    }
}
