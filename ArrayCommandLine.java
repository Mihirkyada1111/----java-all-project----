
public class ArrayCommandLine {
    public void getData(String args[]) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args);
        }
    }

    public static void main(String[] args) {

        ArrayCommandLine a = new ArrayCommandLine();
        a.getData(args);

    }
}
