import java.util.Scanner;
class phone
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
    long n,c=0,d;
    n=sc.nextLong();
    while(n!=0)
    {
        d=n%10;
        n=n/10;
        c++;
    }
    if(c==10)
    {
        System.out.print("Valid");
    }
    else
    {
        System.out.print("Invalid");
    }
    }
}