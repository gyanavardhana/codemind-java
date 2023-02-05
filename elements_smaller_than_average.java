import java.util.*;
class j
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int sum=0,f;
        int c=0;
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
       f=sum/n;
       for(int i=0;i<n;i++)
       {
           if(a[i]<=f)
           {
               c+=1;
           }
       }
       System.out.println(c);
    }
}