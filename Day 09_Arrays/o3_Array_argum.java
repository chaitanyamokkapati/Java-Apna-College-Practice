public class o3_Array_argum {
    public static void pass_ref_UPDATE(int marks[]) {
        //updation
        for(int i = 0; i < marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String[] args) {
        int marks[] ={76, 72, 56};
        pass_ref_UPDATE(marks);

        // Print all MARKS

        for(int i = 0; i < marks.length; i++){
            System.out.println("marks : " + marks[i]);
        }
    }
}
