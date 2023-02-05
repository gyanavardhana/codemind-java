import java.util.Scanner;
class reverse
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
    int n,r,sum=0,i;
    n=sc.nextInt();
    i=n;
    while(n!=0)
    {
        r=n%10;//4 3 2 
        n=n/10;//123 12 1
        sum=sum*10+r;//4 43 432 4321 
    }
    System.out.print(sum);
    }
}