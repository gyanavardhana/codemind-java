import java.util.Scanner;
class power
{
	public static void main(String args[])
	{
		Scanner  sc=new Scanner(System.in);
        int x,i,c=0,t,k=1;
        t=sc.nextInt();
        while(t!=0)
        {
            x=t%10;
            t=t/10;
            c=c+x;
            k=k*x;
        }
        System.out.print(Math.abs(c-k));
        sc.close();
	}
}