import java.util.Scanner;
public class BowlerClass extends CricketPlayerClass
{
    Scanner scan = new Scanner(System.in);
    int over;
    public void Bowler()
    {
        System.out.println("enter your bolling over");
        over = scan.nextInt();
    }
    public static void main(String[] args)
    {
        BowlerClass b=new BowlerClass();
        b.Player();
        b.CricketPlayer();
        b.Bowler();

    }
}
