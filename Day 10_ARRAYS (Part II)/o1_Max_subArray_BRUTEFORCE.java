public class o1_Max_subArray_BRUTEFORCE {
    public static void SubArrayBRUTE(int num[]) {
        int currentsum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < num.length; i++){
            //System.out.println("i is "+i);
            int start = i;
            for(int j = 0; j < num.length; j++){
                //System.out.print("j is " + j +" ");
                int end = j;
                currentsum = 0;
                for(int k = start; k <= end; k++){
                    //System.out.println("k is " + k +" ");
                    //To print Sub Array Num
                    //System.out.println(num[k]);
                    currentsum += num[k];
                    //System.out.println(num[k]);
                }
                //System.out.println(currentsum);
                if (maxSum < currentsum) {
                    maxSum = currentsum;
                }
            }
        }
        System.out.println("Max Sum = "+maxSum);
    }
    public static void main(String[] args) {
        int num[] = {1, 2, 4, 8, 10};
        SubArrayBRUTE(num);
    }
}
