import java.util.Scanner;
class lcm
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
   int x, y, i, gcd=0,lcm;
   x=sc.nextInt();
   y=sc.nextInt();

   for (i = 1; i <= x && i <= y; i++)  
   {
      if (x % i == 0 && y % i == 0)
         gcd = i;
   }
   lcm=(x*y)/gcd;

   System.out.print(lcm);
    }
}