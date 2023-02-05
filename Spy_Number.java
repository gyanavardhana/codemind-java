import java.util.*;
class J
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0,mul=1,d;
        while(n>0)
        {
            d=n%10;
            sum=sum+d;
            mul=mul*d;
            n/=10;
        }
        if(sum==mul)
        {
            System.out.println("Spy Number");
        }
        else
        {
            System.out.println("Not Spy Number");
        }
    }
}