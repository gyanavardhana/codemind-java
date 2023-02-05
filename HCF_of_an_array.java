import java.util.Scanner;
class hcf
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
    int n,i,gcd;
    n=sc.nextInt();
    int arr[]=new int[n];
    for(i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    gcd=arr[0];
    int j=1;
    while(j<n)
    {
       if(arr[j]%gcd==0)
       {
           j++;
       }
       else
       {
           gcd=arr[j]%gcd;
           i++;
       }
    }
    System.out.print(gcd);
    }
}