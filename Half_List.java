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
        int k=n/2;
        for(int i=n-1;i>=k;i--)
        {
            System.out.print(a[i]+" ");
        }
        for(int i=0;i<k;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}