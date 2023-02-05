import java.util.*;
class j
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int e=0,o=0;
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
                e+=1;
            }
            else
            {
                o+=1;
            }
        }
        int od[]=new int[o];
        int ev[]=new int[e];
        int b=0,b1=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
                ev[b]=a[i];
                b+=1;
            }
            else
            {
                od[b1]=a[i];
                b1+=1;
            }
        }
        for(int i=0;i<o;i++)
        {
            System.out.print(od[i]+" ");
        }
        for(int i=0;i<e;i++)
        {
            System.out.print(ev[i]+" ");
        }
    }
}