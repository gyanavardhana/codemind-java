import java.util.Scanner;
class closest
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,s=0,d;
        n=sc.nextInt();
        i=n;
        while(n!=0)
        {
            d=n%10;
            n=n/10;
            s=s*10+d;
        }
        System.out.print(s);
        sc.close();
    }
}