public class InnerClass {
    public class innerClass {
        public void display() 
        {
            System.out.println("inner class is called");
        }
    }

    public void display1() 
    {
        System.out.println("display1 function is called");
    }

    public static void main(String[] args) {
        InnerClass i = new InnerClass();
        i.display1();

        InnerClass.innerClass inn = new InnerClass().new innerClass();
        inn.display();
    }
}
