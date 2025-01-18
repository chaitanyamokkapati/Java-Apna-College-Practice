import java.util.Scanner;

public class o4_PassOrFail {
    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);
        System.out.print("Enter Your Marks: ");
        int input_marks = UserInput.nextInt();

        String PassOrFail = input_marks >= 33 ? "Pass" : "Fail";
        System.out.println(PassOrFail);
        UserInput.close();
    }
}