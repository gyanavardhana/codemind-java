
import java.util.Scanner;
class tables
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        if(a%2==0 || b%2==0)
        {
            System.out.print("Player 1");
        }
        else
        {
            System.out.print("Player 2");
        }
    }
}