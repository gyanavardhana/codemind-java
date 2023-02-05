import java.util.*;
class J
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int a,b;
            a=sc.nextInt();
            b=sc.nextInt();
            if(a==b && a>=l)
            {
                System.out.println("ACCEPTED");
            }
            else if(a<l || b<l)
            {
                System.out.println("UPLOAD ANOTHER");
            }
            else
            {
                System.out.println("CROP IT");
            }
        }
    }
}