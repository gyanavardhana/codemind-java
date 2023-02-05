import java.util.*;
class j
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int e=0,o=0;
        int n=sc.nextInt();
        while(n>0)
        {
            int d=n%10;
            if(d%2==0)
            {
                e+=1;
            }
            else
            {
                o+=1;
            }
            n/=10;
        }
        if(o!=0 && e!=0)
        {
            System.out.println("Mixed");
        }
        else if(o==0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
    }
}