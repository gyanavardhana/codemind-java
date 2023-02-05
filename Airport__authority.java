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
        int b=sc.nextInt();
        int sum=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]>b)
            {
                sum+=2;
            }
            else
            {
                sum+=1;
            }
        }
        System.out.println(sum);
    }
}

