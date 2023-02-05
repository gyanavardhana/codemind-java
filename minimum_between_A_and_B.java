import java.util.Scanner;
class Array
{
       public static void main(String args[])
      {
           Scanner sc=new Scanner (System.in);
           int n,i,min=999,a,b,g=0,g1=0;
           n=sc.nextInt();
          int x[]=new int[n];
          for(i=0;i<n;i++)
          {
               x[i]=sc.nextInt();
          }
          a=sc.nextInt();
          b=sc.nextInt();
          for(i=0;i<n;i++)
          {
              if(x[i]>=a && x[i]<=b)
              {
              if(x[i]<min)
              {
                  min=x[i];
              }
              }
          }
          if(min==999)
          {
              System.out.print("-1");
          }
          else
          {
          System.out.print(min);
          }
           sc.close();
      }
}