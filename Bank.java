abstract class Bank
{
    abstract double getRateofIntrest();
}
class BankA extends Bank
{
    public double getRateofIntrest()
    {
        System.out.println("Bank A is called "+"5.0%");
        return 5.0;
    }
}
class BankB extends Bank
{
    public double getRateofIntrest()
    {
        System.out.println("Bank B is called "+"8.0%");
        return 8.0;
    }
}
class BankC extends Bank
{
    public double getRateofIntrest()
    {
        System.out.println("Bank C is called "+"7.5");
        return 7.5;
    }

    public static void main(String[] args) 
    {
        BankA a = new BankA(); 
        a.getRateofIntrest();

        BankB b = new BankB(); 
        b.getRateofIntrest();

        BankC c =new BankC();
        c.getRateofIntrest();
    }
}
