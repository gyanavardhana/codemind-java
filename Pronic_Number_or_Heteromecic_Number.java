import java.util.Scanner;
class pronic
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
    int n,k=0,c=0,i,j;
    n=sc.nextInt();
    for(i=1;i<=n;i++)
    {
        c=0;
        for(j=1;j<=n;j++)
        {
            if(i*j==n)
            {
                if(i-j==1)
                {
                    c++;
                    k=1;
                }
            }
        }
        if(c==1)
        {
            break;
            
        }
        else
        {
            continue;
        }
    }
    if(k==1)
    {
        System.out.print("YES");
    }
    else
    {
        System.out.print("NO");
    }
    }
}