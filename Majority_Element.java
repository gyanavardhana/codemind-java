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
        int max=0,k=0;
        for(int i=0;i<n;i++)
        {
            int c=0;
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
            if(c>=n/2)
            {
                System.out.println(a[i]);
                break;
            }
        }
    }
}