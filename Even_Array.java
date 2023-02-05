import java.util.Scanner;
class divisible
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,a,c=0;
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            a=sc.nextInt();
            if(a%2!=0)
            {
                if(a!=0)
                {
                   c+=1;
                }
            }
        }
        if(c>0)
        {
            System.out.print("False");
        }
        else
        {
            System.out.print("True");
        }
        sc.close();
    }
}