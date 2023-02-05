import java.util.Scanner;
class classname
{
    public static void main(String arge[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],i,sum=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
           x[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
            sum=sum+x[i];
        }
        System.out.println(sum);
    }
}
