import java.util.Scanner;
class closest
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,f=0,x=0,d,j,c=0;
        n=sc.nextInt();
        for(j=2;j<n;j++)
        {
            if(n%j==0)
            {
                c+=1;
            }
        }
        if(c==0)
        {
        while(n!=0)
        {
            d=n%10;
            n=n/10;
            f=0;
            for(i=1;i<=d;i++)
            {
                if(d%i==0)
                {
                    f+=1;
                }
            }
            if(f!=2)
            {
                System.out.print("Not Mega Prime");
                x+=1;
                break;
            }
        }
        if(x==0)
        {
            System.out.print("Mega Prime");
        }
        }
        else
        {
            System.out.print("Not Mega Prime");
        }
        sc.close();
    }
}