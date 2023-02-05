import java.util.Scanner;
class even
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,c=0,k=0;
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        k=sc.nextInt();
        for(i=0;i<n;i++)
    {
        if(arr[i]==k)
        {
            c++;
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
    }
}