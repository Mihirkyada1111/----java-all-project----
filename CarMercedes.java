abstract class CarMercedes
{
    abstract void display();
    void testdata()
    {
        System.out.println("testdata  function is called");
    }
}    
class volkswagen extends CarMercedes
{
    public void test()
    {
        System.out.println("non function test function is called");
    }
    public void display()
    {
        System.out.println("display function is called");
    }

    public static void main(String[] args)
    {
        CarMercedes c= new volkswagen();
        c.testdata();
        c.display();
        volkswagen v=new volkswagen();
        v.test();
    }
}