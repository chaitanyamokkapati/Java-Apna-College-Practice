import java.util.Scanner;

public class o4_linearSearch {
    public static int linearSearch(int numbers[], int key) {
        for(int i = 0; i < numbers.length; i++){
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
        
    }
    public static void main(String[] args) {
        int numbers[] = {1, 2, 4, 6, 7, 8, 10, 12, 15, 20, 23, 24};
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter key : ");
        int key = SC.nextInt();
        int index = linearSearch(numbers, key);
        if (index == -1) {
            System.out.println("Index not Found!!!");
        }
        else{
            System.out.println("Your KEY " + key +" Index is = index ["+index + "]");
        }

        SC.close();
    }
}
