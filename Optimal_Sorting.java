import java.util.Scanner;
class clas
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n,x,j,c=0;
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            int  a[],h=9999,b=0;
            x=sc.nextInt();
            a=new int[x];
            for(j=0;j<x;j++)
            {
                 a[j]=sc.nextInt();
            }
           c=0;
            for(j=0;j<x-1;j++)
            {
                 if(a[j]<=a[j+1])
                {
                        c+=1;
                }
            }
           if(c+1==x)
           {
               System.out.println("0");
           }
           else
           {
             for(j=0;j<x;j++)
            {
                 if(a[j]>=b)
                {
                        b=a[j];
                }
            }
           for(j=0;j<x;j++)
            {
                 if(a[j]<=h)
                {
                        h=a[j];
                }
            }
         System.out.println(b-h);
           }
        }
    }
}