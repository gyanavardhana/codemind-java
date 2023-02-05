
import java.util.Scanner;
class fence
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float f,c=0;
        f=sc.nextFloat();
        c=(f-32)*5/9;
        System.out.format("%.2f",c);
        sc.close();
    }
}