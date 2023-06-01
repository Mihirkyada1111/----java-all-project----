public class overriding 
{
    public void bankName(String name)
    {
        System.out.println(name);
    }
}
class Bank 
{
    public void BankIntrest(double Intrest)
    {
        System.out.println(Intrest);
    }
}
class BankA 
{
    public void BankIntrestAmount(int Amount)
    {
        System.out.println(Amount);
    }
}
class BankB
{
    public void BankIntrestTime(int time)
    {
        System.out.println(time+"years");
    }

    public static void main(String[] args)
    {
        overriding o=new overriding();
        o.bankName("HDFC");

        Bank a= new Bank();
        a.BankIntrest(7.5);

        BankA b= new BankA();
        b.BankIntrestAmount(10000);

        BankB c= new BankB();
        c.BankIntrestTime(10);
    }
}