public class ForLoopStar {

    public static void ForLoopPattern(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("\n");

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
        }

        System.out.println(" ");
    }

    public static void main(String[] args) {
        int n = 5;
        ForLoopPattern(n);
    }
}
