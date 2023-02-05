import java.util.Scanner;
class j
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,d,r=0,t;
        a=sc.nextInt();
        t=a;
        while(a>0)
        {
            d=a%10;
            r=r*10+d;
            a=a/10;
        }
        if(r==t)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}