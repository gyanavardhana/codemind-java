import java.util.*;
class J
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int l=0;l<t;l++)
        {
        int n=sc.nextInt();
        int b=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int j=0;j<b;j++)
        {
            int temp=a[n-1];
            for(int i=n-1;i>0;i--) 
            {
                a[i]=a[i-1]; 
            }
            a[0]=temp;
        }
         for(int i=0;i<n;i++)
            {
                if(i==n-1)
                {
                     System.out.print(a[i]);
                     break;
                }
                System.out.print(a[i]+" ");
            }
            System.out.println("");
        }
    }
}