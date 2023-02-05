
import java.util.*;
class J
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            b[i]=sc.nextInt();
        }
        int sum=0,s=0;
        for(int i=0;i<n;i++)
        {
            s+=a[i];
            sum+=b[i];
        }
        int k=s-sum;
        if(k<0)
        {
        System.out.println((-1)*k);
        }
        else
        {
            System.out.println(0);
        }
        
    }
}