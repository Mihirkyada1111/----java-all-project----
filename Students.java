public class Students {

    static int roll;

    static void setData() {
        roll = 1111;
    }

    static void getData() {
        System.out.println("Your Roll Number is ==>" + roll);
    }

    public static void main(String[] args) {
        setData();
        getData();
    }

}
