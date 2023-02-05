import java.util.Scanner;
class fence
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float f=0,c;
        c=sc.nextFloat();
        f=(c*9/5)+32;
        System.out.format("%.2f",f);
        sc.close();
    }
}