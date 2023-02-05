
import java.util.*;
class J
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int w=0,c=1;
        int n1=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            c=1;
            if(a[i]==-1)
            {
                continue;
            }
            for(int j=i+1;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    c+=1;
                    a[j]=-1;
                }
            }
            if(n1==c)
            {
                w=1;
                System.out.print(a[i]+" ");
            }
        }
        if(w==0)
        {
            System.out.println("-1");
        }
    }
}