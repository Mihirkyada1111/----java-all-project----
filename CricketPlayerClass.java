import java.util.Scanner;
public class CricketPlayerClass extends PlayerCLass
{

    int no;
    Scanner scan =new Scanner(System.in);
    public void  CricketPlayer()
    {
        System.out.println("Enter player no");
        no = scan.nextInt();
    }    
    public static void main(String[] args)
    {
        CricketPlayerClass c = new CricketPlayerClass();
        c.Player();
        c.CricketPlayer();

    }

}
