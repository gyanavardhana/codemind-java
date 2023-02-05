import java.util.Scanner;
class fence
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int l,b,w,c,area,cost;
        l=sc.nextInt();
        b=sc.nextInt();
        w=sc.nextInt();
        c=sc.nextInt();
        area=2*w*(l+b+2*w);
        cost=area*c;
        System.out.print(cost);
        sc.close();
    }
}