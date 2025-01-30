public class o5_LargestInArray {
    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < numbers.length; i++){
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int numbers[] = {1, 2, 4, 6, 7, 8, 10, 12, 15, 20, 23, 24};
        System.out.println("Largest among Array are : " + getLargest(numbers));
    }
}
