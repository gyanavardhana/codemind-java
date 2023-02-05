import java.util.Scanner;
class unique
{
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
    int n,i,j,k=0,sum=0,x=0,a,b;
    n=sc.nextInt();
    int arr[]=new int[n];
    for(i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
     a=sc.nextInt();
    b=sc.nextInt();
    for(i=0;i<n;i++)
    {
       if(arr[i]>=a && arr[i]<=b)
       {
           continue;
       }
       else
       {
           sum=sum+arr[i];
       }
    }
    System.out.print(sum);
    }
}