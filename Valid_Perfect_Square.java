import java.util.*;
import java.lang.*;
class J
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int k=0;k<t;k++)
        {
            int c=0;
            int a=sc.nextInt();
            for(int i=1;i<a;i++)
            {
                if(Math.pow(i,2)==a)
                {
                    c=1;
                    System.out.println("True");
                    break;
                }
            }
            if(c==0)
            {
                System.out.println("False");
            }
        }
    }
}