import java.util.Scanner;
class amicable
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,i,s=0,c=0;
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=1;i<=a/2;i++)
        {
            if(a%i==0)
            {
                s=s+i;
            }
        }
        for(i=1;i<=b/2;i++)
        {
            if(b%i==0)
            {
                c=c+i;
            }
        }
        if(c==a && s==b)
        {
            System.out.print("Amicable");
        }
        else
        {
            System.out.print("Not Amicable");
        }
        sc.close();
    }
}