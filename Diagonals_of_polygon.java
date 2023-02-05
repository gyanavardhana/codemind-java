import java.util.Scanner;
class diagonals
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,d=0;
        n=sc.nextInt();
        d=n*(n-3)/2;
        System.out.print(d);
        sc.close();
    }
}