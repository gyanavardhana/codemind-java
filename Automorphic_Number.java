import java.util.Scanner;
class automorphic
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
    int n,sq=0,d=0,c=0,temp=0,s=0,l=0,p=0;
    n=sc.nextInt();
    temp=n;
    sq=n*n;
    while(n!=0)
    {
        d=n%10;
        n=n/10;
        c++;
    }
    while(sq!=0)
    {
        p=(int)Math.pow(10,c);
        l=sq%p;
        sq=sq/10;
        if(l==temp)
        {
            System.out.print("Automorphic Number");
            s++;
            break;
        }
    }
    if(s==0)
    {
        System.out.print("Not an Automorphic Number");
    }
    }
}