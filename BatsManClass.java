import java.util.Scanner;
public class BatsManClass extends CricketPlayerClass
{
    Scanner scan = new Scanner(System.in);
    int over;
    public void BatsMan()
    {
        System.out.println("enter your Bating over");
        over = scan.nextInt();
    }
    public static void main(String[] args)
    {
        BatsManClass b=new BatsManClass();
        b.Player();
        b.CricketPlayer();
        b.BatsMan();

    }
}
