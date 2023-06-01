import java.util.Scanner;

public class StudentMarkSheetScanner {
    // void display()
    // {
    // String name,surname;
    // int rollNo,id,age;
    // System.out.println("name:-" + name +"surnam:-"+ surname +"rollno:-"+ rollNo
    // +"id:-"+ id +"age:-" + age);
    // }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String name, surname;

        System.out.println("enter your name");
        name = scn.nextLine();

        System.out.println("enter your surname");
        surname = scn.nextLine();

        System.out.println("enter your roll no");
        int rollNo = scn.nextInt();

        System.out.println("enter your gr id");
        int id = scn.nextInt();

        System.out.println("enter your age");
        int age = scn.nextInt();

        System.out.println(name);
        System.out.println(surname);
        System.out.println(rollNo);
        System.out.println(id);
        System.out.println(age);
    }
}
