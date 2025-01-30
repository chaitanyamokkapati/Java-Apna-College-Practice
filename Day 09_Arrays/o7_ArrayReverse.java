public class o7_ArrayReverse {
    public static void ArrRev(int num[]) {
        int first = 0;
        int last = num.length - 1;

        while (first < last) {
            //Swap
            int temp = num[last];
            num[last] = num[first];
            num[first] = temp;

            first++;
            last--;

        }
    }
    public static void main(String[] args) {
        int num[] = {1, 2, 4, 6, 7, 8, 10, 12, 15, 20, 23, 24};
        ArrRev(num);

        for(int i = 0; i < num.length; i++){
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }
}
