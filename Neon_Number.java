import java.util.Scanner;
class spy
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,m=1,k=0,d,s=0;
        n=sc.nextInt();
        k=n*n;
        while(k!=0)
        {
            d=k%10;
            k=k/10;
            s=s+d;
        }
        if(s==n)
        {
            System.out.print("Neon Number");
        }
        else
        {
            System.out.print("Not Neon Number");
        }
        sc.close();
    }
}