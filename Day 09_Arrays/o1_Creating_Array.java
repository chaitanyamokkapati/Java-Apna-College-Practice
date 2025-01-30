public class o1_Creating_Array {
    public static void main(String[] args) {
        int array_1 [] = new int [50]; //manual
        array_1 [0] = 1;
        array_1 [1] = 2;
        int marks [] = {45, 55, 75, 56, 89}; //dynamic
        //
        for(int i = 0; i < marks.length; i++){
            System.out.println("Element at index " + i + " : " + marks[i]);
        }
    }
}
