import java.util.Scanner;
class closest
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,k=0,f=0,a=0,b=0,c=0,m,t,j;
        n=sc.nextInt();
        for(i=n;i>=2;i--)
        {
            c=0;
            for(j=1;j<=i;j++)
            {
               if(i%j==0)
               {
                   c+=1;
               }
            }
            if(c==2)
            {
                k=n-i;
                a=i;
                break;
            }
        }
        for(i=n+1;i>=n;i++)
        {
            c=0;
            for(j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    c+=1;
                }
            }
            if(c==2)
            {
                f=i-n;
                b=i;
                break;
            }
        }
        if(f<k)
        {
            System.out.println(f);
        }
        else if(k<f)
        {
            System.out.println(k);
        }
        else
        {
            System.out.println(n-a);
        }
        sc.close();
    }
}