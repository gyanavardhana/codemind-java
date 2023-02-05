import java.util.Scanner;
class fibinocci
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,c=0,s=0,i;
        n=sc.nextInt();
        for(i=1;i<=n/2;i++)
        {
            if(n%i==0)
            {
                s=s+i;
            }
        }
        if(s>n)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
        sc.close();
    }
}