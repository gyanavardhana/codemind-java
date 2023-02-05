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
        int w=0;
        int c=1,c1=0,sum=0;
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
            if(a[i]==c)
            {
                w+=1;
            }
        }
            System.out.println(w);
    }
}