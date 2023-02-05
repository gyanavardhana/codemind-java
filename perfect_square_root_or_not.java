import java.util.Scanner;
class sqare
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,c=0;
        n=sc.nextInt();
        for(i=1;i<=n/2;i++)
        {
            if(i*i==n)
            {
                c+=1;
            }
        }
        if(c>0)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
        sc.close();
    }
}