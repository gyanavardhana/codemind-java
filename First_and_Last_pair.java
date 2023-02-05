import java.util.*;
class j
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int k=0;
        int n=sc.nextInt();
        if(n%2==0)
        {
             k=n;
        }
        else
        {
             k=n+1;
        }
        int a[]=new int[n];
        int b[]=new int[k];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int p=0;
        for(int i=0;i<n/2;i++)
        {
            b[p]=a[i];
            b[p+1]=a[n-1-i];
            p+=2;
        }
        if(n%2!=0)
        {
            b[k-2]=a[n/2];
        }
        for(int i=0;i<k;i++)
        {
            System.out.print(b[i]+" ");
        }
    }
}