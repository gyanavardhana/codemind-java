import java.util.Scanner;
class fibinocci
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,c=0,d;
        n=sc.nextInt();
        while(n!=0)
        {
            d=n%10;
            n=n/10;
            if(d>c)
            {
                c=d;
            }
        }
        System.out.print(c);
        sc.close();
    }
}