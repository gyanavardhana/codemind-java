import java.util.Scanner;
class candies
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
    int n,i,k,max=0;
    n=sc.nextInt();
    int arr[]=new int[n];
    for(i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    k=sc.nextInt();
    max=arr[0];
    for(i=0;i<n;i++)
    {
        if(max<arr[i])
        {
            max=arr[i];
        }
    }
    for(i=0;i<n;i++)
    {
        arr[i]=arr[i]+k;
        if(arr[i]>=max)
        {
            System.out.print("True ");
        }
        else
        {
            System.out.print("False ");
        }
    }
    }
}