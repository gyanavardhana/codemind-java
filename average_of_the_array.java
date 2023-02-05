import java.util.*;
class j
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        float sum=0,f;
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
       for(int i=0;i<n;i++)
       {
           sum+=a[i];
       }
       f=(float)sum/n;
       System.out.format("%.2f",f);
    }
}