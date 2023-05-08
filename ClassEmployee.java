public class ClassEmployee {
    int emp_id = 0;
    String emp_name;
    String emp_designation;
    int salary;

    void getData() {
        System.out.println("Employe id is:-1111" + emp_id);
        System.out.println("Employe name is:-mihir" + emp_name);
        System.out.println("Employe designation " + emp_designation);
        System.out.println("Employe salary:-20000" + salary);
    }

    public static void main(String[] args) {
        ClassEmployee c = new ClassEmployee();
        c.getData();
    }
}
