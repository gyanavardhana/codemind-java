import java.util.Scanner;
class circular
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
    int  n,c=0,rev=0,d=0,i;
    n=sc.nextInt();
    for(i=1;i<=n;i++)
    {
        if(n%i==0)
        {
           c++; 
        }
    }
    if(c==2)
    {
        rev=0;
        while(n!=0)
        {
           d=n%10;
           n=n/10;
           rev=(rev*10)+d;
        }
        c=0;
        for(i=1;i<=rev;i++)
        {
            if(rev%i==0)
            {
                c++;
            }
        }
        if(c==2)
        {
           System.out.print("circular prime");
        }
        else
        {
            System.out.print("prime but not a circular prime");
        }
    }
    else
    {
        System.out.print("not prime");
    }
    }
}