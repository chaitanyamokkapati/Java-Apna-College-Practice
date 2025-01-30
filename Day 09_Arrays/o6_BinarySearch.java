public class o6_BinarySearch {
    public static int BinSearch(int num[], int key) {
        int start = 0;
        int end = num.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            // Comparisions
            if (num[mid] == key) {
                return mid;
            }
            if (num[mid] < key) { //Right
                start = mid + 1;
            }
            else{//LEFT
                end = mid - 1;
            }
        }
        return - 1;
    }
    public static void main(String[] args) {
        int num[] = {1, 2, 4, 6, 7, 8, 10, 12, 15, 20, 23, 24};
        int key = 12;
        System.out.println("Index for key is : " + BinSearch(num, key));
    }
}
