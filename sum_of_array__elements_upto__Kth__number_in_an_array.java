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
        int sum=0;
        int k=sc.nextInt();
        for(int i=0;i<n;i++)
        {
           if(a[i]==k)
           {
               sum+=a[i];
               break;
           }
           sum+=a[i];
        }
        System.out.println(sum);
    }
}