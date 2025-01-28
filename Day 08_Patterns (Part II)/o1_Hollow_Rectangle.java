public class o1_Hollow_Rectangle {
    public static void Hollow_rect(int Rows, int Cols) {
        // OUTER LOOP
        for(int i = 1; i <= Rows; i++){
            // INNER LOOP - Coloumns
            for(int j = 1; j <= Cols; j++){
                if (i == 1 || i == Rows || j == 1 || j == Cols) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();

        }

    }
    public static void main(String[] args) {
        Hollow_rect(10,7);
    }
}
