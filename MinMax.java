public class MinMax {
    public static void main(String[] args) {
        int r, c;
        int a[] = { 5, 10, 15, 20, 25, 30, 35, 40, 45, 50 };
        int min = a[0];
        int max = a[0];
        for (r = 1; r < a.length; r++) {
            if (a[r] < min) {
                min = a[r];
            } else if (a[r] > max) {
                max = a[r];
            }
        }
        System.out.println("your minimum value is:-" + min);
        System.out.println("your maximum value is:-" + max);
    }
}
