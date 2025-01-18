public class o3_UniryIncDec {
    public static void main(String[] args) {
        // Post-increment example
        int post_incre_a = 5;
        int post_incre_b = post_incre_a++;
        System.out.println(post_incre_a);  // Prints 6 (post-increment increases after assignment)
        System.out.println(post_incre_b);  // Prints 5 (the value of post_incre_a before increment)
        System.out.println("----".repeat(5));

        // Pre-increment example
        int pre_incre_a = 5;
        int pre_incre_b = ++pre_incre_a;
        System.out.println(pre_incre_a);  // Prints 6 (pre-increment increases before assignment)
        System.out.println(pre_incre_b);  // Prints 6 (the value of pre_incre_a after increment)
        System.out.println("----".repeat(5));

        // Post-decrement example
        int post_decre_a = 5;
        int post_decre_b = post_decre_a--;
        System.out.println(post_decre_a);  // Prints 4 (post-decrement decreases after assignment)
        System.out.println(post_decre_b);  // Prints 5 (the value of post_decre_a before decrement)
        System.out.println("----".repeat(5));

        // Pre-decrement example
        int pre_decre_a = 5;
        int pre_decre_b = --pre_decre_a;
        System.out.println(pre_decre_a);  // Prints 4 (pre-decrement decreases before assignment)
        System.out.println(pre_decre_b);  // Prints 4 (the value of pre_decre_a after decrement)
        System.out.println("----".repeat(5));
    }
}
