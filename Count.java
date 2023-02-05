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
        int e=0,o=0;
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
        System.out.print(e+" "+o);
    }
}