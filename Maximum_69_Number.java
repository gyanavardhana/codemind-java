import java.util.Scanner;
class max
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
    int  n,d,i=0,j;
    n=sc.nextInt();
    int a[]=new int[n];
    while(n!=0)
    {
        d=n%10;
        n=n/10;
        a[i]=d;
        i++;
    }
    for(j=i;j>=0;j--)
    {
        if(a[j]==6)
        {
            a[j]=9;
            break;
        }
    }
    for(j=i-1;j>=0;j--)
    {
       System.out.print(a[j]);
    }
    }
}