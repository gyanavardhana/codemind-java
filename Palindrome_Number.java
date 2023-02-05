import java.util.Scanner;
class palindrome
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
    int n, s, i,j;
    n=sc.nextInt();
    int arr[]=new int[n];
    int a[]=new int[n];
    int t[]=new int[n];
    for (i=0;i<n;i++)
    {
        a[i] = 0;
    }
    for (i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
        t[i]=arr[i];
    }
    for (i=0;i<n;i++)
    {
        while(arr[i]!=0)
        {
            j=arr[i]%10;
            arr[i]/=10;
            a[i]=j+a[i]*10;
        }
    }
    for (i=0;i<n;i++)
    {
        if(a[i]==t[i])
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
    }
}