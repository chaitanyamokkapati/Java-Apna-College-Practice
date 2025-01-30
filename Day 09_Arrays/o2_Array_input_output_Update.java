import java.util.Scanner;

public class o2_Array_input_output_Update {
    public static void main(String[] args) {
        int marks[] = new int[100];
        Scanner SC = new Scanner(System.in);

        marks[0] = SC.nextInt();
        marks[1] = SC.nextInt();
        marks[2] = SC.nextInt();

        System.out.println("phy : " + marks[0]);
        System.out.println("chem : " + marks[1]);
        System.out.println("mat : " + marks[2]);

        // marks[2] = 56; update
        //System.out.println("mat : " + marks[2]);

        SC.close();

    }
}
