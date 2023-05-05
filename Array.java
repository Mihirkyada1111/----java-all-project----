public class Array {
    public static void main(String[] args) {
        int a[] = new int[5];

        a[0] = 100;
        a[1] = 200;
        a[2] = 300;
        a[3] = 400;
        a[4] = 500;

        for (int i = 0; i < 5; i++) {
            System.out.println(a[i]);
        }

        int b[][] = new int[2][3];
        b[0][0] = 10;
        b[0][1] = 20;
        b[0][2] = 30;

        b[1][0] = 40;
        b[1][1] = 50;
        b[1][2] = 60;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
