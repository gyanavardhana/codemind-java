import java.util.*;
class J
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b,n,c=0;
        a=sc.nextInt();
        b=sc.nextInt();
        n=sc.nextInt();
        for(int i=a;i<=b;i++)
        {
            if(i%n==0)
            {
                c+=1;
            }
        }
        System.out.println(c);
    }
}