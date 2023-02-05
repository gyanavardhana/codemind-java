import java.util.Scanner;
class classname
{
    public static void main(String arge[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i;
        n=sc.nextInt();
        if(n%3==0)
    {
        System.out.print("Pling");
    }
    if(n%5==0)
    {
        System.out.print("Plang");
    }
    if(n%7==0)
    {
        System.out.print("Plong");
    }
    else if(n%3!=0 && n%5!=0 && n%7!=0)
    {
        System.out.print(n);
    }
    }
}