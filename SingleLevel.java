public class SingleLevel 
{
    public void display()
    {
        System.out.println("parent class is called=> A");
    }    

    public static void main(String[] args)
    {
        SingleLevel s =new SingleLevel();
        s.display();
    }
}
