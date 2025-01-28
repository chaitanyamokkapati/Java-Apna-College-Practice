import java.util.Scanner;

public class o10_BinaryToDecimal {
    public static void BinToDec(int binNum) {
        int pow = 0;
        int decNum = 0;
        int myNum = binNum;

        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2, pow));

            pow++;
            binNum = binNum / 10;
        }
        System.out.println("Decimial of " + myNum + " = " + decNum );

    }
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        System.out.println("Please Enter binary : ");
        int binNum = userIn.nextInt();
        BinToDec(binNum);
        userIn.close();

    }
    
}
