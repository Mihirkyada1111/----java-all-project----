import java.util.Scanner;
public class PlayerCLass 
{
    String name;
    Scanner scan =new Scanner(System.in);
    public void Player()
    {
        System.out.println("Enter your name");
        name = scan.nextLine();
    }    
    public static void main(String[] args)
    {
        PlayerCLass p= new PlayerCLass();
        p.Player();
    }
}
