import java.util.Scanner;

public class DaySwitchProgram {
    public static void main(String[] args) {

        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;

            case 2:
                System.out.println("Monday");
                break;

            case 3:
                System.out.println("Tuesday");
                break;

            case 4:
                System.out.println("Wednesday");
                break;

            case 5:
                System.out.println("Thusrday");
                break;

            case 6:
                System.out.println("Friday");
                break;

            case 7:
                System.out.println("Satuarday");
                break;

            default:
                System.out.println("invalid day");
                break;

        }

    }
}
