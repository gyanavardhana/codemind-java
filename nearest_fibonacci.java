import java.util.Scanner;
class fibonacci
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
    int n,i=0,a=1,b=2,c=0,min=999,sem=999,z=0,x=0,y=0;
    n=sc.nextInt();
    int arr[]=new int[50];
    arr[0]=a;
    arr[1]=b;
    i=2;
    while(c<n*n)
    {
        c=a+b;
        a=b;
        b=c;
        arr[i]=c;
        i++;
    }
    z=i;
    for(i=0;i<z;i++)
    {
        if(arr[i]<=n)
        {
            if(n-arr[i]<min)
            {
                min=n-arr[i];
                x=arr[i];
            }
        }
        else
        {
            if(arr[i]-n<sem)
            {
                sem=arr[i]-n;
                y=arr[i];
            }
        }
    }
    if(min<sem)
    {
        System.out.print(x);
    }
    else if(sem<min)
    {
        System.out.print(y);
    }
    else
    {
        System.out.print(x+" ");
        System.out.print(y);
    }
    }
}