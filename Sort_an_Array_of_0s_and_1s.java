import java.util.*;
class J
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int c=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]==0)
            {
                c+=1;
            }
        }
        for(int i=0;i<n;i++)
        {
            if(c>0)
            {
                a[i]=0;
                c--;
            }
            else
            {
                a[i]=1;
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}