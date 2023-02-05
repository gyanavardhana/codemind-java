import java.util.Scanner;
class fibinocci
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,k,s;
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            k=sc.nextInt();
            s=sc.nextInt();
            System.out.println(k+s);
        }
        
    }
}